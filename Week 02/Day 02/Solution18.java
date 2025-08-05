public class Solution18 {
    public static int altSum(int n){
        if (n==0) return 0;
        return n-altSum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(altSum(n));//output 3
    }
    
}
