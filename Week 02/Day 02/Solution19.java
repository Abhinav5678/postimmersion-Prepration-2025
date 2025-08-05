public class Solution19 {
    public static int fun(int n) {
        if(n==1) return 1;
        return n*fun(n-1)+fun(n-1);
        
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(fun(n));//output 12
    }
    
}
