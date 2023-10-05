import java.util.Scanner;
public class Pripinsta9 {
    public static void main(String[] args) {
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n > 0){
            int digit = n % 10;
            rev = rev*10 + digit;
            n = n/10;
        }
        System.out.print(rev);
    }
}
