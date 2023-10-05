import java.util.Scanner;
// Method 1: Using Brute Force
public class Pripinsta8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, digit;
       
        while(n > 0){
            digit = n%10;
            sum = sum + digit;
            n = n/10;
        }
        System.out.print(sum);

    }
}
