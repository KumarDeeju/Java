import java.util.Scanner;

public class PripinstaHarsadNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0,rem,dev;
        int n = sc.nextInt();
        int temp = n;
        while(temp != 0){
            rem = temp % 10;
            sum = sum + rem;
            temp = temp/10;
        }
         dev = n/sum;
         System.out.println(dev);
    }
}
