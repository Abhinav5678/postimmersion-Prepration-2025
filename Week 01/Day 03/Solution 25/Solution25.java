public class Solution25 {
    public static void main(String[] args) {
        int a = 4;          // 0100
        int b = 6;          // 0110
        int c = (a | b) >> 1;  // (0100 | 0110) = 0110 → 0110 >> 1 = 0011 = 3

        System.out.println(c);  // Output: 3
    }
}

