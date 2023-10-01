import java.util.Scanner;

public class LoopFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem,mult = 1;

        while(n != 0){
            rem = n % 10;
            mult *= rem;
            n = n/10;
        }
        System.out.println(mult);
    }
}
