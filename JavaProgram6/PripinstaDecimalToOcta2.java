import java.util.Scanner;
public class PripinstaDecimalToOcta2{
public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int Decimal = sc.nextInt();
        int n=0,rem,Octal=0;

        while(Decimal > 0){
            rem = Decimal % 8;
            Octal += rem * Math.pow(10, n);
            Decimal /= 8;
            n++;
        }
        System.out.println(Octal);
    }
}