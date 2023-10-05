import java.util.Scanner;

public class PripinstaDecimalToBinary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem,n=0,Binary=0;
        int Decimal = sc.nextInt();

        while(Decimal > 0){
            rem = Decimal % 2;
            Binary += rem * Math.pow(10, n);
            Decimal /= 2;
            n++;
        }
        System.out.println(Binary);
    }
}
