import java.util.Scanner;

public class PripinstaDecimalToOcta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem,Octal=0,n=0;
        int Decimle = sc.nextInt();

        while(Decimle > 0){
            rem = Decimle % 8;
            Octal += rem * Math.pow(10, n);
            Decimle /= 8;
            n++;
        }
        System.out.println(Octal);
    }
}
