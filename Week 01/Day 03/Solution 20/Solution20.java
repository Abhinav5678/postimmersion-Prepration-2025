public class Solution20 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        // (a > 3 && b < 3) → true
        // (a - b > 1) → true
        // One of the OR conditions is true → Output True
        if ((a > 3 && b < 3) || (a - b > 1)) {
            System.out.println("True");  // Output: True
        } else {
            System.out.println("False");
        }
    }
}

