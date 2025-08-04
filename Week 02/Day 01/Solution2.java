public class Solution2 {
    public static int mystery(int p,int q){
        if(q==0) return 0;
        return p+mystery(p, q-1);
    }
    public static void main(String[] args) {
        int a=3;
        int b=4;
        System.out.println(mystery(a,b)); //output 12
    }
    
}
