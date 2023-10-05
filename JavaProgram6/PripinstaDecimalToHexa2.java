import java.util.Scanner;

public class PripinstaDecimalToHexa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem,Hexa=0,n=0;
           int Decimal = sc.nextInt();

        while(Decimal > 0){
            rem = Decimal % 16;
            Hexa += rem * Math.pow(10, n);
            Decimal /= 16;
            n++;
        }
        System.out.println(Hexa);
    }
}
