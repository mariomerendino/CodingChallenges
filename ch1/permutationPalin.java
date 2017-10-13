import java.util.*;

public class permutationPalin{
    public static void ans(int[] a0, int[]a1){
        int[] ans = new int[a0.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i < a0.length; i++){
            if(map.containsKey(a0[i])){
                map.put(a0[i], map.get(a0[i])+1);
            }
            else{
                map.put(a0[i], 1);
            }
        }
        for(int i=0; i < a1.length; i++){
            if(map.containsKey(a1[i]))
        }

    }
}