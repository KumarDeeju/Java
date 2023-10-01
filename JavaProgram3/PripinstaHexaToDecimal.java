import java.util.Scanner;

public class PripinstaHexaToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, sum = 0,rem;
        int hexa = sc.nextInt();
        while(hexa != 0){
            rem = hexa % 10;
            sum += rem*Math.pow(16, n);
            hexa = hexa/10;
            n++;
        }
        System.out.println(sum);
    }
}
