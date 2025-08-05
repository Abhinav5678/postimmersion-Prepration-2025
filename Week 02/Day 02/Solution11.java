public class Solution11 {
    public static int foo(int a){
        if (a<=0) return 0;
        else if (a==1) return 1;
        return foo(a-1)+foo(a-2);
    }
    public static void main(String[] args) {
        int a=4;
        System.out.println(foo(4)); // output 3
    }
    
}
