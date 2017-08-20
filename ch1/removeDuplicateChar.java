import java.util.*;

public class removeDuplicateChar{
    public static String word = "HelloWorld";

    public static void remDuplicate(){
        String w = new String("");
        HashMap<Character, Integer> ch = new HashMap<Character, Integer>();
        for(int i = 0; i < word.length(); i++){
            if(ch.containsKey(word.charAt(i))){

            }
            else{
                w = w + word.charAt(i);
                ch.put(word.charAt(i), i);
            }
        }
        word = w;
    }
    public static void main(String[] args){
        System.out.println("Before: " + word);
        remDuplicate();
        System.out.println("After: " + word);
    }
}