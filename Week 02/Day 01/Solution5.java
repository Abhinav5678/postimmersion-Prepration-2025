public class Solution5 {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        int num=4;
        System.out.println(fact(num)); // Output: 24
    }
}
