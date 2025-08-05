public class Solution16 {
    public static int power(int p,int q){
        if (q==0) return 1;
        return p*power(p,q-1); 
    }
    public static void main(String[] args) {
        int n=2;
        int m=4;
        System.out.println(power(n,m));//output 16
    }
    
}
