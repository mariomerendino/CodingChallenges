#include <iostream>
#include <assert.h>
#include <vector>
#include <string>
using namespace std;

/* Displays the content of a string vector, 
	 @param vstrings: gives the vector to be displayed
*/
void DisplayVector (vector<string> vstrings){
	cout << endl << "Displaying Vector: " <<endl;
	int i =0; 
	for(vector<string>::iterator it = vstrings.begin(); it != vstrings.end(); it++){
		cout << "\t" << i << ". " << *it <<endl;
		i++;
	}
}

int BS(vector<string> vstrings, string value, int left, int right){
	if (right >= left)
	{
		 int mid = left + (right - left)/2;
  
		 // If the element is present at the middle itself
		 if (vstrings.at(mid) == value)
		 	return mid;
  
		 // If element is smaller than mid, then it can only be present
		 // in left subarray
		 if (vstrings.at(mid)  > value) 
		 	return BS(vstrings, value, left, mid-1);
  
		 // Else the element can only be present in right subarray
		 else
		 	return BS(vstrings, value, mid+1, right);
	}
  
	// We reach here when element is not present in array
	return -1;
}
/*
	 Binary search an array of strings for a given value, return the index if the value if found; otherwise return 0
	 @param vstrings: gives the vector to be displayed
	 @param value: the value we are looking for 
	 @precondition: vector contains vector.size number of values in ascending order 
	 @postcondition: if value appeared in the vector, its index is returned; otherwise -1 is returned 
*/
int BinarySearch(vector<string> vstrings, string value){

	return BS(vstrings, value, 0, vstrings.size());
}




/* 
 Deletes (i.e., removes) the element stored in the specified position from the SORTED vector, the 
 array should be sorted afterwards
	 @param vector: gives the vector to be from which to delete 
	 @param index: we want to delete the {index}-th value in the vector 
	 @precondition: vector contains vector.size() number of values in ascending order 
				index < vector.size()
	 @postcondition: if value stored in {index}-th position will be removed, the vector is still sorted. 
					 vector.size() is decreased by 1
*/
void Delete (vector<string> & vstrings, int index){
	int i = 0;
	for(vector<string>::iterator it = vstrings.begin(); it != vstrings.end(); it++){
		if(index == i){
			vstrings.erase(it);
		}
		i++;
	}
}

/*
 * Deletes (i.e., removes) the element value by first searching for it and then deleting
 * if found. Uses BinarySearch(vector<string> vstrings, string value, int &index) to get
 * the index to pass into Delete(vector<string>, int index).
 * @param vector: gives the vector to be deleted from
 * @param string: we want to delete this value from the vector.
 * @precondition: vector contains vector.size() number of values in ascending order
 * @postcondition: if value is stored in vector, it will be removed, the vector will still be sorted.
 *      vector.size() is decreased by 1.
 */
void Delete (vector<string> & vstrings, string value){
	for(vector<string>::iterator it = vstrings.begin(); it != vstrings.end(); it++){
		if(*it == value){
			vstrings.erase(it);
		}
	}
}


/* 
	inserts a value into an sorted array so that the array remains sorted,
	i.e., the value should be inserted before the first value that is 
	larger than it.  If the array's content is "ann" "becky" "charlotte" "karen",
	and the value to be inserted into the array is "julie", it should be put right
	before "karen", and the resulting array should be "ann" "becky" "charolette"
	"julie" "karen" (assume all input is converted to lower case)
	@param vstrings: the vector that the value is to be inserted into
	@param value: the value to be inserted 
	@return: the index of the value in the vector 
	@precondition: vector.size() < vector.capacity() grow the vector 
	@postcondition: value is inserted into the vector, and the vector is sorted 
						 vector.size() is incremented by 1.
 */ 
int InsertByValue (vector<string> & vstrings, string value){
	if(vstrings.size() == 0){
		vstrings.push_back(value);
		return 0;
	}
	else if(vstrings.size() == 1){
		if(vstrings.at(0) > value){
			vstrings.insert(vstrings.begin(), value);
			return 0;
		}
		else{
			vstrings.push_back(value);
			return 1;
		}
		
	}
	else{
		int index = 0; 
		for(vector<string>::iterator it = vstrings.begin(); it != vstrings.end(); it++){
			if(value < *it){
				vstrings.insert(it, value);
				return index;
			}
			index++;
		}
		return index;
		
	}
	
}



/* 
	BONUS***
	rearrange the values stored in array into ascending order 
	@param vstrings: the string vector to be sorted
	@precondition: none
	@postcondition: vector[0]<=vector[1]<=vector[2]<=...<=vector[vector.size()-1] alphabetically
*/
void Sort (vector<string> & vstrings);

int main()
{
	// A vector can be partially filled, there is no need to have a companion 
	// variable for the NumberElements or Capacity because those are part of
	// vector and accessible via vstrings.size() and vstrings.capacity() respectively.

	vector<string> vstrings;    // a string vector

	// Unnecessary, but we are demonstrating the idea of reserving space to grow
	// into
		//vstrings.reserve(CAPACITY); // only grows when necessary

	//1. Fill vector<string> with data in sorted order
	//       Display the array afterwards
	string temp_str;
	do {
		cout << "Enter another name or -1 to end input: ";
		cin >> temp_str;
		if (temp_str != "-1") {
				InsertByValue(vstrings, temp_str);
		}
	} while (temp_str != "-1");

	DisplayVector(vstrings);


	//2. TODO: Prompt the user to enter a value to search for, search for the value, and
	// report the result
	string searchVal = 0;
	cout << "Enter a string to search for: ";
	cin >> searchVal;
	int bs = BinarySearch(vstrings, searchVal);
	if(bs == -1){
		cout << "\nError: Entry Not found" <<endl;
	}
	else{
		cout << "\nValue found at: " << bs << endl;
	}


	// 3. ToDo: Call your function to insert a value (entered by the user) into the vector
	//
	// Display the content of the vector afterwards


	// 4. ToDo: Prompt the user to enter an index (for the value to be deleted), and then delete the elements
	//   stored there.
	// Display the content of the vector after the deletion.


	// 5. ToDo: Prompt the user to enter an value in the vector (to be deleted), and then delete the element
	// Display the contents of the vector after the deletion.


	// BONUS: implement sorting vector.

	//vector<string>={"becky","ann","karen","julie","frances"};

	//5. ToDo: call you sorting function to sort AnotherArray into ascending order 

}