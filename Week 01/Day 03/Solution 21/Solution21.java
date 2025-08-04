public class Solution21{
    public static void main(String[] args) {
        int a = 5;        // 0101
        int b = 3;        // 0011
        int c = (a & b) << 1;  // (0101 & 0011) = 0001 → 0001 << 1 = 0010 = 2

        System.out.println(c);  // Output: 2
    }
}

