import java.util.*;

import javax.net.ssl.ExtendedSSLSession;

public class arrayAdd{
    public static void main(String[] args){
        int[] arr = {1,4,5,9};
        printArr(arr);
        addOne(arr);
        printArr(arr);
    }
    public static void printArr(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(Integer.toString(a[i]) + " ");
        }
        System.out.println();
    }
    public static void addOne(int[] a){
        boolean exit = false;        
        int i = 1;
        a[a.length-i] = a[a.length-i]++;  
        while(!exit){
            if(a[a.length-i] == 10){
                a[a.length-i] = 0;
                i++;
                a[a.length-i] = a[a.length-i]++;
            }
            else{
                exit = true;
                
            }
        }
    }
}