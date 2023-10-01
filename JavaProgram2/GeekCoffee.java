import java.util.Scanner;
public class GeekCoffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tl = scanner.nextInt();
        while (tl-- > 0) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();
            while (m > 1 && n > 0) {
                n = n / 2;
                m--;
            }
            System.out.println(n);
        }
    
    }
}
