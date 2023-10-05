import java.util.Scanner;
public class PripinstaBinaryToDecimal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Decimal = 0,rem,n=0;
        int Binary = sc.nextInt();

        while(Binary != 0){
            rem = Binary % 10;                                              
            Decimal += rem * Math.pow(2, n);
            Binary = Binary / 10;
            n++;
        }
        System.out.println(Decimal);
    }
}
