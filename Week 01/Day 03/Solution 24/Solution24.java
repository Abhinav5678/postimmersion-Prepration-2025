public class Solution24 {
    public static void main(String[] args) {
        int a = 16;         // 00010000
        int b = a >> (2 + 1);  // 16 >> 3 = 00010000 → 00000010 = 2

        System.out.println(b);  // Output: 2
    }
}
