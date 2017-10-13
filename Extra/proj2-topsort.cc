/**********************************************************************
 *
 * Brooke Cantwell
 * CISC 4080: Computer Algorithms
 * Project 2: Topological Sorting
 * 23 March 2017
 * 
 *
 **********************************************************************/

#include <algorithm>
#include <fstream>
#include <iostream>
#include <map>
#include <string>
#include <vector>

using namespace std;

// misc datatypes

template <typename NodeType> struct Edge {
   NodeType from;
   NodeType to;
};

template <typename NodeType> struct Graph {
   vector<NodeType> vertices;
   vector<Edge<NodeType>> edges;
};

//map for storing indegrees
map<char, int> indegree_map;

template <typename T> map<T, int> indegree_template_map;

//map to store pairs of vertices to use for faster lookup
multimap<char, char> edge_map;

// function declarations
template <typename NodeType>
istream& operator>>(istream& is, Edge<NodeType>& e);

template <typename NodeType>
ostream& operator<<(istream& is, const Edge<NodeType>& e);

template <typename NodeType> Graph<NodeType> getData(string fileName);

template <typename NodeType> vector<NodeType> topSort(Graph<NodeType> g);

int main(int argc, char** argv)
{
   /*
    * get the data
    */
   if (argc != 2) {
      cerr << "Usage: " << argv[0] << " datafile\n";
      return 1;
   }
   Graph<char> g = getData<char>(argv[1]);

   /*
    * do the topological sort
    */
   vector<char> tSort = topSort(g);

   /*
    * report results
    */
   for (auto vertex: tSort)
      cout << vertex << " ";
   cout << endl;

   return 0;
}

/*
 * function definitions
 */

// input operator: read an edge from an input stream
// edge has form (v,w) where vertices v and w are of type NodeType
template <typename NodeType>
istream& operator>>(istream& is, Edge<NodeType>& e)
{
   NodeType initial, terminal;
   char lparen, comma, rparen;
   is >> lparen >> initial >> comma >> terminal >> rparen;
   if (!is) return is;
   if (lparen != '(' || comma != ',' || rparen != ')') {
      cerr << "Bad format " << lparen <<  initial << comma 
           <<  terminal <<  rparen
           << " ... edge ignored\n";
      return is;
   }
   e.from = initial;
   e.to = terminal;
   return is;
}

// output operator: write an edge to an output stream
// edge has form (v,w) where vertices v and w are of type NodeType
template <typename NodeType> 
ostream& operator<<(ostream& os, const Edge<NodeType>& e)
{
   os<< '(' << e.from << ',' << e.to << ')';
   return os;
}

// read graph data from a file
template <typename NodeType> Graph<NodeType> getData(string fileName)
{
   ifstream dataStream(fileName.c_str());
   if (!dataStream) {
      cerr << "can't open " << fileName << endl;
      exit(1);
   }

   Edge<NodeType> e;
   Graph<NodeType> g;

   // vertices
   char ch;
   while (dataStream >> ch && !(isspace(ch) || ch == '(')) {
      dataStream.putback(ch);
      //initialize values in the indegree map to 0 for each V
      indegree_map.insert(pair<char, int>(ch, 0)); 
      NodeType temp;
      dataStream >> temp;
      g.vertices.push_back(temp);
   }
   dataStream.putback(ch);

   // edges
   while (dataStream >> e) {
      g.edges.push_back(e);
      indegree_map[e.to]++;
      edge_map.insert(pair<char, char>(e.from, e.to));
   }

   return g;
}


char findSource( ) {

   char val;
   bool found = false;
   for (auto ii = indegree_map.begin( ); ii != indegree_map.end( ); ii++) {
      if (ii -> second == 0) {
         val = ii -> first;
	 ii -> second = -999;
	 found = true;
	 break;
     }
   }
   
   if (found != true)
      val = '\0';

   return val;
}

// return a vector of topologically sorted nodes
template <typename NodeType> 
vector<NodeType> topSort(Graph<NodeType> g)
{
   vector<NodeType> ts;
   char source;
   int count = 0;
   int max = g.vertices.size( );
   while (count <= max) {
      source = findSource( );

      if (source == '\0')
	 break;
      else {
	 pair<multimap<char, char>::iterator, multimap<char, char>::iterator> ii = edge_map.equal_range(source);
	 for (auto it = ii.first; it != ii.second; it++) {
            char c = it -> second;
	    indegree_map[c]--;
	 }
	 ts.push_back(source);
	 typename vector<NodeType>::iterator v = find(g.vertices.begin( ), g.vertices.end( ), source);
	 if (v != g.vertices.end( ))
            g.vertices.erase(v);
      }
   }
   
   return ts;   
}
