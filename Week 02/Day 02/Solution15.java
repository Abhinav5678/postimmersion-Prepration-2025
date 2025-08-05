public class Solution15 {
    public static void f(int n){
        if(n<1) return;
        f(n/2);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int num=8;
        f(8);
        //output
        //1
        //2
        //4
        //8
    }
    
}
