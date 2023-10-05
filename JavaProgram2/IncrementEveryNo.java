import java.util.Scanner;

public class IncrementEveryNo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
            int m = 0;
         while(n > 0){
             int rem = n % 10;
             if(rem == 9){
                 m = (m * 10) + rem;
             }else{
            m = m * 10 + (rem + 1);
        }
        n /= 10;
        }
        // REVERSE KE LIYE DIG KO
         n = m;
         m = 0;
         while(n > 0){
            int rem = n % 10;
            m = m * 10 + rem;
            n /= 10;
         }
         System.out.print(m);
    }
}
/*
ENCREMENT EVERY DIGIT OF NUMBER

 INPUT 1- 6789
 OUTPUT 1- 7899

INPUT 2- 9999
OUTPUT 2- 9999
 * 
 */
