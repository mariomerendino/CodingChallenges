import java.util.*;
public class googleVideo{
    public static void main(String[] args){
        int[] arr = {1,2,3,9};
        printArr(arr);
        printArr(findMult(arr,9));
    }
    //find two values in the array that add to a value
    public static int[] findSum(int[] a, int sum){
        int[] ans = new int[2];
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < a.length; i++){
            if(s.contains(sum-a[i])){
                ans[0]=sum-a[i];
                ans[1]=a[i];
            }
            else{
                s.add(a[i]);
            }           
        }
        return ans;
    }
    //prints array
    public static void printArr(int[] a){
        System.out.println();
        System.out.print("Printing Array: ");
        for(int i =0; i < a.length; i++){
            System.out.print(Integer.toString(a[i])+ " ");
        }
        System.out.println();        
    }
    //finds 2 values in an array that when multiplied together
    //return the value
    public static int[] findMult(int[] a, int mult){
        int[] ans = new int[2];
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < a.length; i++){
            if(s.contains(mult/a[i])){
                ans[0]=mult/a[i];
                ans[1]=a[i];
            }
            else{
                s.add(a[i]);
            }           
        }
        return ans;
    }
}