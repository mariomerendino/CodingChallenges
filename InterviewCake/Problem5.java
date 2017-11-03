public class Problem5{
    public static void main(String[] args){
        int[] denominations = {1,2,3};
        int change = 4;
        System.out.println("For num: " + Integer.toString(change) + "THe Num of ways to make" + 
        "change is " +  Integer.toString(amtWaysToMakeChange(change, denominations)));
    }
    //Example: for amount=4¢ and denominations=[1¢,2¢,3¢]
    //would output 4—the number of ways to make 4¢ with those denominations:
    public static int amtWaysToMakeChange(int n, int[] d){
        int ans = 0;
        for(int i = 0; i < d.length; i++){
            while()
        }
        return ans;
    }
}