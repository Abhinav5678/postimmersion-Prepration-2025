public class Solution22{
    public static void main(String[] args) {
        int a = 5;          // 0101
        int b = 3;          // 0011
        int c = a ^ (b & a);  // (0011 & 0101) = 0001 → 0101 ^ 0001 = 0100

        System.out.println(c);  // Output: 4
    }
}
