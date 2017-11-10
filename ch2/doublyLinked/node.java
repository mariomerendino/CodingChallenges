import java.util.*;

public class node{
    public int val = 0;
    public node prev;
    public node next;
    public node(){
        prev = null;
        next = null;
    }
    public node(int x){
        val = x;
    }
}