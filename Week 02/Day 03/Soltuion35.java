public class Soltuion35 {
    public static void f(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b); // Output: 5 3 (swapped)
    }

    public static void main(String[] args) {
        int x = 3, y = 5;
        f(x, y);
        System.out.println(x + " " + y); // Output: 3 5 (original values unchanged)
    }
}


