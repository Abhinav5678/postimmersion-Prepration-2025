public class Solution19 {
    public static void main(String[] args) {
        int x = 0;

        // x != 0 is false → NOT(false) = true
        if (!(x != 0)) {
            System.out.println("Zero");  // Output: Zero
        } else {
            System.out.println("Non-zero");
        }
    }
}

