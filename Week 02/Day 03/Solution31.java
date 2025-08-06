public class Solution31 {
    public static int increment(int x) {
        x = x + 1;
        return x;
    }

    public static void main(String[] args) {
        int a = increment(2);  // 3
        int b = increment(a);  // 4
        System.out.println(b); // Output: 4
    }
}

