import java.util.*;


public class MyQueue{
    public Stack<String> s1 = new Stack<String>();
    public Stack<String> s2 = new Stack<String>();
    

    public static void main(String[] args){
        MyQueue q = new MyQueue();
        int input = 1;
        Scanner sc = new Scanner(System.in);
        while(input != 0){
            System.out.println("1.Print Queue\n2.Add\n3.Remove\n4.Peek\n0.Exit");
            input = sc.nextInt();
            if(input == 1){
                q.printQueue();
            }
            if(input == 2){
                System.out.println("What would you like to add?\n");
                q.push(sc.next());
            }
            if(input == 3){
                System.out.println(q.remove() + " Removed");                
            }
            if(input == 4){
                System.out.println(q.peek() + " is up next");                                
            }

        }
        sc.close();
    }
    public MyQueue(){

    }
    public void push(String val){
        s1.push(val);
    }
    public String remove(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        String ans = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ans;
    }
    public String peek(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        String ans = s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return ans;
    }
    public void printQueue(){
        System.out.println("\nMy Queue:");
        while(!s1.isEmpty()){
            System.out.print(s1.peek() + " ");
            s2.push(s1.pop());
        }
        System.out.println();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
}