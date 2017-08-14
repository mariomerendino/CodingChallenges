#include <iostream>
using namespace std;
//Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0
void printMatrix(int[][], int m, int n);
void replaceZero(int[][], int m, int n);
void fillMatrix(int[][], int m, int n);

int main(){
    int matrix[10][10];
    fillMatrix(matrix, 10, 10);
    printMatrix(matrix, 10, 10);
    
}

//prints matrix
void printMatrix(int matrix[][], int m, int n){
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            cout << matrix[i][j];
        }
    }
}
//replaces 0s
void replaceZero(int matrix[][], int m, int n){
    
}
//fills the matrix
void fillMatrix(int matrix[][], int m, int n){
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            matrix[i][j] = i * j;
        }
    }
}
