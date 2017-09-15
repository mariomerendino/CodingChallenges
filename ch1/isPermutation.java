import java.util.*;

//Checks if permutation
public class isPermutation{
    public static boolean permutation(char[] s1, char[] s2){
        boolean ans = true;
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        for(int i = 0; i < s1.length; i++){
            if(s1[i] != s2[i]){
                return false;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        if( permutation("dsa".toCharArray(), "asd".toCharArray())){
            System.out.println("They are a permutation");
        }
        else{
            System.out.println("They are not a permutation");
        }
    }
}