public class Solution23 {
    static int x = 100;

    public static void check() {
        int x = 50;
        System.out.println(x); // Output: 50
    }

    public static void main(String[] args) {
        check();
        System.out.println(x); // Output: 100
    }
}

