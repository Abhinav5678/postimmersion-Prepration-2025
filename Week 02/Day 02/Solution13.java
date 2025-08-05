public class Solution13 {
    public static void fun(int num){
        if(num==0) {
            return;
        }
        fun(num-1);
        fun(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        int n=2;
        fun(n);
        // output
        //1
        //1
        //2
    }
    
}
