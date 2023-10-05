import java.util.Scanner;
public class Facttorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            fact = i*fact;
        }
        System.out.print(fact);

    }
}
