public class Solution23 {
    public static void main(String[] args) {
        int a = 2;              // 0010
        int b = (a << 2) | 1;   // 0010 << 2 = 1000 → 1000 | 0001 = 1001 = 9

        System.out.println(b);  // Output: 9
    }
}

