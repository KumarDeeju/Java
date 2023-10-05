import java.util.Scanner;
// Method 1: Using Brute Force
public class Pripinsta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNo = sc.nextInt();
        int endNo = sc.nextInt();
        int sum = 0;

        for(int i = startNo;i<=endNo;i++){
            sum += i;
        }
        System.out.print(sum);
    }
}
