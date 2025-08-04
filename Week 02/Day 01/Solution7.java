public class Solution7 {
    public static int fun(int n) {
        if (n <= 1) {
            return n;
        }
        return fun(n - 1) + fun(n - 3);
    }

    public static void main(String[] args) {
        int num=5;
        System.out.println(fun(num)); //output 1
    }
}

    

