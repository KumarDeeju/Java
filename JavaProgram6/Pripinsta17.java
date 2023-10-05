import java.util.Scanner;
public class Pripinsta17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem,sum=0,n=0;
        int Decimal = sc.nextInt();

        while (Decimal > 16) {
            rem = Decimal % 16;
            sum += rem * Math.pow(10, n);
            Decimal = Decimal / 16;
            n++;
        }
        System.out.println(sum);
    }
}
