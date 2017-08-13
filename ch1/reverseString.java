import java.util.*;

public class reverseString{
    public static String reverse(String word){
        String ans = new String("");
        for(int i = word.length()-1; i >= 0; i--){
            ans = ans + word.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args){
        String word = "testing...";
        System.out.println("Before: " + word);
        System.out.println("After: " + reverse(word));
    }
}