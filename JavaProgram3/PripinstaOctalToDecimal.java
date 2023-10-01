import java.util.Scanner;
public class PripinstaOctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Octal=0,rem,n=0;
        int m = sc.nextInt();

        while   (m != 0){
            rem = m % 10;
            Octal += rem*Math.pow(8, n);
            m = m/10;
            n++;
        }
        System.out.println(Octal);
    }
}
