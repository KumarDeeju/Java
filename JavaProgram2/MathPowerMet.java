import java.util.Scanner;

public class MathPowerMet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        double res = Math.pow(n, m);

        int rm = (int)res; // DOUBLE TO INTEGER IN CHANGE
        
        System.out.println(rm);
    }
}

// OUTPUT IS ;
// 5
// 2
// 25