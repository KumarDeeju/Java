import java.util.Scanner;

public class PripinstaDecimalToHexa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Decimle = sc.nextInt();
        int rem,n=0,Hexa=0;
        while(Decimle > 0){
            rem = Decimle % 10;
            Hexa += rem * Math.pow(16, n);
            Decimle /= 10;
            n++;
        }
        System.out.println(Hexa);
    }
}
