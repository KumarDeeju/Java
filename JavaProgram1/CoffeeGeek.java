import java.util.Scanner;

public class CoffeeGeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long m = sc.nextLong();
            while (m > 1 && n > 0) {
                n = n / 2;
                m--;
            }
            System.out.print(n);
        }
    }
}
