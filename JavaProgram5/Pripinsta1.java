import java.util.Scanner;
// Method 1 : Using for Loop
public class Pripinsta1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0;i<=n;i++){
            sum += i;
        }
        System.out.print(sum);
    }
}
