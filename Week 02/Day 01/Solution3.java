public class Solution3 {
    public static int f(int num){
        if (num==0) return 0;
        return num+f(num-2);
        
    }
    public static void main(String[] args) {
        int num=6;
        System.out.println(f(num));//output 12
    }
    
}
