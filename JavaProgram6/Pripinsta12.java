import java.util.Scanner;
public class Pripinsta12 {
    public static void main(String[] args) {
        int Ans=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            Ans *= i;
        }
        System.out.print(Ans);
    }
}
