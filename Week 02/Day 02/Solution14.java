public class Solution14 {
    public static int productofDigits(int num){
        if (num==0) return 1;
        return (num %10)*productofDigits(num/10);

    }
  public static void main(String[] args) {
    int n=123;
    System.out.println(productofDigits(n));//output 6
  }  
}
