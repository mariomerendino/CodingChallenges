#include <iostream>
#include <time.h>
using namespace std;


int main(){
    time_t start, end;
    const int leng = 200;
    int a[leng];

    //fill array with random variables
    srand (time(NULL));
    for(int i =0; i < leng; i++){
        int v1 = rand() % 100;
        a[i]=v1;
    }

    //run bubble sort and set times.
    int temp = 0;
    start = clock();
    for(int i = 0; i < leng-1; i++){
        for(int j = 0; j < leng-1; j++){
            if(a[j] > a[j+1]){
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
    }
    end = clock();

    cout << (double)(end - start) / CLOCKS_PER_SEC * 1000;
}