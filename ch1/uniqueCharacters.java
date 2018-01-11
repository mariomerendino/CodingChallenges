import java.util.*;

//Checks if a string has all unique Characters. 
public class uniqueCharacters{
    //Without extra data structures... Run time O(n^2)
    public static Boolean uniqueChar(String word){
        for(int i = 0; i < word.length(); i++){
            for(int j = 0; j < word.length(); j++){
                if(word.charAt(i) == word.charAt(j) && i != j){
                    return false;
                }
            }
        }
        return true;
    }
    //With Hashmap... run time O(n). 
    public static Boolean uniqueChar1(String word){
        //The integer isnt used. 
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < word.length(); i++){
            //if the map already contains the character return false
            if(map.containsKey(word.charAt(i))){
                //map.get(key)
                return false; 
            }
            //or else add it to the map. 
            else{
                map.put(word.charAt(i), 1);                
            }
        }
        return true;
    } 
    //HASHSET
    public static Boolean uniqueChar2(String word){
        //The integer isnt used. 
        HashSet<Character> set = new HashSet<Character>();
        for(int i = 0; i < word.length(); i++){
            //if the map already contains the character return false
            if(set.contains(word.charAt(i))){
                return false; 
            }
            //or else add it to the map. 
            else{
                set.add(word.charAt(i));                
            }
        }
        return true;
    } 
    public static void main(String[] args){
        //Input a String. 
        if(uniqueChar2("abac")){
            System.out.println("UNIQUE");
        }
        else{
            System.out.println("NOT UNIQUE");
        }
    }
}