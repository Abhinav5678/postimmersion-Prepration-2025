public class Solution30 {
    static int x = 10;

    public static void show() {
        // System.out.println(x); // This will cause error if x is declared after this
        int x = 20;
        System.out.println(x); // Output: 20
    }

    public static void main(String[] args) {
        show();
    }
}

