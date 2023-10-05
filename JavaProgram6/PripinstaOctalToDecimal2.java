import java.util.Scanner;
public class PripinstaOctalToDecimal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem,Decimal = 0,n=0;

        int Octal = sc.nextInt();

        while(Octal > 0){
            rem = Octal % 10;
            Decimal += rem * Math.pow(8, n);
            Octal = Octal / 10;
            n++;
        }
        System.out.print(Decimal);
    }
}
