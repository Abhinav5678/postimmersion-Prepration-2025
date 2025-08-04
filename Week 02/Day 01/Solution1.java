public class Solution1 {
    public static int sum(int b) {
        if (b==1) return 1;
        return b+sum(b-1);
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(sum(a));// output 15


    }
    
}
