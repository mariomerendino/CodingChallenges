import java.util.*;

public class stackArray{
    public int[] stack = new int[30];
    public int arrSplit = stack.length/3;
    public int l1 = 0;
    public int l2 = 0;
    public int l3 = 0;
    
    public stackArray(){

    }
    //Pushes a value to the desired stack. 
    public void push(int s, int val){

    }
    //pops value from desired stack
    public int pop(int s){


    }
    //gets top value from desired stack
    public int top(int s){
        
    }
    //checks if a desired stack is empty
    public boolean isEmpty(int s){
        if(s == 1 && l1 == 0)
            return true;
        else if (s == 2 && l2 == 0)
            return true;
        else if (s == 3 && l3 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args){

    }
}