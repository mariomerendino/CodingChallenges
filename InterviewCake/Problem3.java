//Given an array of integers, 
//find the highest product you can get from three of the integers
import java.util.*;
public class Problem3{
    public static void main(String[] args){
        int[] arr = {1,2,8,12,10,3,4};
        print(arr);
        System.out.println("Largest Product of 3 ints is = " + Integer.toString(HighestProdOf3(arr)));
    }
    public static int HighestProdOf3(int[] list){
        Arrays.sort(list);
        return(list[list.length-1]*list[list.length-2]*list[list.length-3]);

    }
    public static void print (int[] list) {
        for(int i =0; i < list.length; i++)
            System.out.print(Integer.toString(list[i])+ " ");
        System.out.println();
    }
}