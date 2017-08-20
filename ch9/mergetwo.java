import java.util.*;

public class mergetwo{
    public static void main(String[] args){

        int[] a = new int[5];
        int[] b = new int[5];
        a[0] = 1;
        for(int i = 1; i < 5; i++){
            a[i] = i + 2;
        }
        b[0] = 0;
        for(int i = 1; i < 5; i++){
            b[i] = i + 1;
        }
        printArr(a);
        //rightShift(a, 10, 3);
        printArr(b);
        merge(a,5,b, 5);
        //printArr(a);


    }
    //Merge two Sorted Arrays, arr1 has a large enough Buffer for both arrays
    public static void merge(int arr1[], int l1,  int arr2[], int l2){
        int[] ans = new int[l1 + l2 - 2];
        int i = 0;
        int j = 0;
        for(int x = 0; x < ans.length; x++){
            if(arr1[i] >= arr2[j]){
                ans[x] = arr2[j];
                j++;
            }
            else{
                ans[x] = arr1[i];
                i++;
            }
        }
        printArr(ans);
    }
    public static void rightShift(int[] arr, int leng, int index){
        int temp = arr[index];
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