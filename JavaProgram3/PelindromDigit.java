import java.util.Scanner;

public class PelindromDigit {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int  n = sc.nextInt();
         int k = n;
         int sum = 0;

         while(k > 0){
            int rem = k % 10;
            sum = (sum * 10) + rem;
            k /= 10;
         }
         System.out.println(sum);
    }
}
