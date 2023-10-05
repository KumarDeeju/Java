import java.util.Scanner;

public class PripinstaBinaryToOctal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Binary = sc.nextInt();
        int rem,Decimle=0,n=0,Octal=0;

        while(Binary != 0){
            rem = Binary % 10;
            Decimle += rem * Math.pow(2, n);
            Binary /= 10;
            n++;
        }
        System.out.println(Decimle);

        while(Decimle != 0){
            rem = Decimle % 8;
            Octal += rem * Math.pow(10, n);
            Decimle /= 8;
            n++;
        }
        System.out.println(Octal);

    }
}
