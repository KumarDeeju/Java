import java.util.Scanner;

public class PripinstaDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem,sum=0,n=0;
        int decimal = sc.nextInt();

        while(decimal != 0){
            rem = decimal % 2;
            sum += rem * Math.pow(10, n);
            decimal = decimal/2;
            n++;
        }
        System.out.println(sum);
    }
}
