import java.util.Scanner;           
public class PripinstaBinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem,ans=0,n=0;
        int binary = sc.nextInt();

        while(binary != 0){
            rem = binary % 10;
            ans += rem * Math.pow(2, n);
            binary = binary / 10;
            n++;
        }
        System.out.println(ans);
    }
}
