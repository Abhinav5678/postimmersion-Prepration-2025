public class Solution12 {
    public static int series(int n){
        if(n==1) return 1;
        return n*series(n-1);
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println(series(num));//output 120
    }
}
