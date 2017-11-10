import java.util.*;

public class linked{
    node head;
    public static void main(String[] args){
        linked x = new linked(7);
        x.append(6);
        x.append(9);
        x.append(12);
        System.out.println("Print list");
        x.read();
        System.out.println("Print list Backwards");        
        x.readBackwards();

    }
    public linked(int val){
        head = new node(val);

    }
    public void append(int val){
        node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new node(val);
        temp.next.prev = temp;

    }
    public void readBackwards(){
        node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp != null){
            
            System.out.print(Integer.toString(temp.val) + " ");
            temp = temp.prev;
        }
        System.out.println();
        
    }
    public void read(){
        node temp = head;
        while(temp != null){
            System.out.print(Integer.toString(temp.val) + " ");
            
            temp = temp.next;
            
        }        
        System.out.println();
    }
    
}