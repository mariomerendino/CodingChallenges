import java.util.*;

//Write a program that replaces every space with %20.
public class replaceSpace{
    public static String repSpace(String word){
        String ans = new String("");
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ' '){
                ans = ans + "%20";
            }
            else{
                ans = ans + word.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String word = new String("oifauf o sosos");
        System.out.println("Before: " + word);
        System.out.println("After: " + repSpace(word));
    }
}