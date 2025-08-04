public class Solution17 {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;

        // Check: x > y is true, y < 3 is also true → AND is true
        if (x > y && y < 3) {
            System.out.println("Inside");  // Output: Inside
        } else {
            System.out.println("Outside");
        }
    }
}
