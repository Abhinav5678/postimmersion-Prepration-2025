public class Solution46 {
    public static int f(int x) {
        if (x % 2 == 0)
            return x;
        else
            return f(x - 1);
    }

    public static void main(String[] args) {
        System.out.println(f(7)); // Output: 6
    }
}

    

