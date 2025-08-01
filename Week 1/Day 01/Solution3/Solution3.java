public class Solution3 {
    public static void main(String[] args) {
        int n = 2;

        switch (n) {
            case 1:
                System.out.print("One");
                break;

            case 2:
                n = n + 1;
                System.out.print("Two");
            

            case 3:
                System.out.print("Three");
                break;

            default:
                System.out.println("Other");
        }
    }
}
