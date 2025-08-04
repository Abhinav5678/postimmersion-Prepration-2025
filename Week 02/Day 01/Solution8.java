public class Solution8 {
    static int count = 0;
    public static void fun(int n) {
        if (n == 0) {
            return;
        }
        count++; // count this call
        fun(n - 1);
        fun(n - 1);
    }

    public static void main(String[] args) {
        fun(3);
        System.out.println("Number of recursive calls: " + count); // Output: 7
    }
}

