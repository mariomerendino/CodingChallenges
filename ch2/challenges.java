import java.util.*;

public class challenges{

    public static void main(String[] args){
        Node head = new Node();
        fillList(head, 20);
        printList(head);
        System.out.println("5th element from end = " + Integer.toString(findNthElementFromEnd(head, 5)));
    }
    /*public static int findNthToLast(){
        int ans;

        return ans;
    }*/
    //fills Linked list with Random Nodes
    //takes in head, and desired number of nodes.
    public static void fillList(Node h, int amt){
        Node temp = h;
        h.value = (int)(Math.random() * 50 + 0);
        for(int i = 0; i < amt; i++){
            temp.next= new Node((int) (Math.random() * (50)) + 0);
            temp = temp.next;
        }
    }
    public static int findNthElementFromEnd(Node h, int n){
        int ans = -999;
        Node temp = h;
        Node temp2 = h;
        
        int count = 0;
        int counter2 = 0;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        while(temp2.next != null){
            if(counter2 == count - n){
                ans = temp2.value;
            }
            temp2 = temp2.next;
            counter2++;
        }
        return ans; 
    }
    public static void printList(Node h){
        Node temp = h;
        System.out.println("List: ");
        while(temp.next != null){
            System.out.print(Integer.toString(temp.value) + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}