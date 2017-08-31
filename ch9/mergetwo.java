import java.util.*;

public class mergetwo{
    public static void main(String[] args){

        int[] a = new int[10];
        int[] b = new int[5];
        a[0] = 1;
        for(int i = 1; i < 5; i++){
            a[i] = i + 2;
        }
        b[0] = 0;
        for(int i = 1; i < 5; i++){
            b[i] = i + 1;
        }
        System.out.println("Print Array A:");
        printArr(a);
        System.out.println("Print Array B:");
        printArr(b);
        merge(a,5,b, 5);
        System.out.println("Print Merged:");        
        printArr(a);


    }
    //Merge two Sorted Arrays, arr1 has a large enough Buffer for both arrays
    public static void merge(int arr1[], int l1,  int arr2[], int l2){
        int j = 0;
        int temp = 0;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] >= arr2[j]){
                //System.out.println("Index: " + Integer.toString(i)+ " " + Integer.toString(arr1[i]));
                //System.out.println("Index: " + Integer.toString(j)+ " " + Integer.toString(arr2[j]));
                temp = arr1[i];
                for(int x = arr1.length-1; x < i+1; x--){
                    arr1[x] = arr1[x-1];
                }
                arr1[i] = arr2[j];                
                arr1[i+1] = temp;
                i++;                                
                j++;
                printArr(arr1);
            }
        }
    }
    public static void rightShift(int[] arr, int leng, int index){
        //int temp = arr[index];
        for(int i = index; i < leng-2; i++){

        }
    }
    public static void printArr(int arr[]){
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}