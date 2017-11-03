//You have an array of integers, and for each index you want 
//to find the product of every integer except the integer at that index.
public class Problem2 {
    public static int[] getProductsOfAllIntsExceptAtIndex (int[] list) {
		int[] ans = new int[list.length];
        int totalProduct = 1;
        for(int i = 0; i < list.length; i++){
        	if(list[i]!=0)
                totalProduct = totalProduct * list[i];
        }
        for(int i = 0; i < list.length; i++){
            if(list[i] != 0)
            	ans[i] = totalProduct / list[i];
            else{
                ans[i] = 0;
            }
        }
        return ans;
    }
    public static void print (int[] list) {
        for(int i =0; i < list.length; i++)
            System.out.print(Integer.toString(list[i])+ " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        // run your function through some test cases here
        // remember: debugging is half the battle!
        int[] list = {1,7,3,4};
        print(list);
        print(getProductsOfAllIntsExceptAtIndex(list));
        
    }
}