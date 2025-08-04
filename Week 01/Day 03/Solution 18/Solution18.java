public class Solution18 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        // x > 0 is true, y < 5 is false → OR makes it true
        if (x > 0 || y < 5) {
            System.out.println("Case1");  // Output: Case1
        } else {
            System.out.println("Case2");
        }
    }
}
