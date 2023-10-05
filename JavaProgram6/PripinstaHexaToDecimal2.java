import java.util.Scanner;
public class PripinstaHexaToDecimal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Hexa = sc.nextInt();
        int rem,n=0,Decimal = 0;

        while(Hexa > 0){
            rem = Hexa % 10;
            Decimal += rem * Math.pow(16, n);
            Hexa /= 10;
            n++;
        }
        System.out.print(Decimal);

    }
}
