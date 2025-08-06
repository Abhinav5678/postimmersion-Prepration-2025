public class Soltuion29 {
    static int x = 1;

    public static void outer() {
        int x = 2;

        class Inner {
            void printX() {
                System.out.println(x); // Output: 2
            }
        }

        Inner inner = new Inner();
        inner.printX();
    }

    public static void main(String[] args) {
        outer();
    }
}

