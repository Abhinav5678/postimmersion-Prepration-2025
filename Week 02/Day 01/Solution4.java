public class Solution4 {
    public static void fun(int x) {
        if (x == 0) {
            return;
        }
        fun(x - 1);    // recursive call
        System.out.println(x); 
    }
    public static void main(String[] args) {
        fun(3); // output 1,2,3
    }
}
