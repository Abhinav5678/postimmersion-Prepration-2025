public class Solution17 {
    public static void countDown(int n){
        if (n==0) return ;
        System.out.println(n);
        countDown(n-1);
    }
    public static void main(String[] args) {
        int n=3;
        countDown(n);
        //output
        //3
        //2
        //1
    }
    
}
