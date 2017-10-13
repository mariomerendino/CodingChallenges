import java.util.*;
public class challenges{

    public static void main(String[] args){
        Node head = new Node();
        fillList(head, 20);
        printList(head);
        System.out.println("Removing duplicates...");
        removeDuplicates(head);
        printList(head);
        
        //System.out.println("5th element from end = " + Integer.toString(findNthToLast(head, 5)));
    }
    //takes in head, and desired number of nodes.
    public static void fillList(Node h, int amt){
        Node temp = h;
        h.value = (int)(Math.random() * 50 + 0);
        for(int i = 0; i < amt; i++){
            temp.next= new Node((int) (Math.random() * (50)) + 0);
            temp = temp.next;
        }
    }
    //Prints list to console. 
    public static void printList(Node h){
        Node temp = h;
        System.out.println("List: ");
        while(temp.next != null){
            System.out.print(Integer.toString(temp.value) + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static int findNthToLast(Node h, int n){
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

    public static void removeDuplicates(Node h){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Node temp = h;
        Node prev = h;
        while(temp.next != null){
            if(map.containsKey(temp.value)){
                prev.next = temp.next;
                temp = temp.next;
            }
            else{
                map.put(temp.value, 0);

                prev = temp;
                temp = temp.next;
            }
        }
    }

    /*
    * You have two numbers represented by a linked list 
    * where each node contains a single digit The digits are stored in reverse order
    * such that the 1’s digit is at the head of the list 
    * Write a function that adds the two numbers and returns the sum as a linked list
    */
    //TO DO.... doesn't work. 
    public static void numAddition(Node h1, Node h2){
        Node ans = new Node();
        Node tempAns = ans;
        Node temp1 = h1;
        Node temp2 = h2;
        int remainder = 0;

        while(temp1.next != null){
            if(temp1.value + temp2.value >= 10){
                int t = temp1.value + temp2.value;
                t = t - 10;
                ans.value = t;
                remainder = 1;
                
            }
            else{
                ans.value = temp1.value + temp2.value;
                remainder = 0;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
            ans = ans.next;
            ans = new Node();
        }
        printList(ans);
    }

}