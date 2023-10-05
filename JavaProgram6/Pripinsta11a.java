import java.util.Scanner;
public class Pripinsta11a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=0;
        int num1 = 1;
        int sum;

        for(int i=0;i<=n;i++){
            sum =num + num1;
            num = num1;
            num1 = sum;
            System.out.print(sum);

        }
        
    }
}
