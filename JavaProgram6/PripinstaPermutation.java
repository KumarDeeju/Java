import java.util.Scanner;

public class PripinstaPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factN = 1, factR = 1;
        int n = sc.nextInt();
        int r = sc.nextInt();

        for(int i=1;i<=n;i++){
            factN *= i;
            
        }
        System.out.println("Factorial(n) :"+factN);

        int dif = n - r;
        for(int i=1;i<=dif;i++){
            factR *= i;
            
        }
        System.out.println("Factorial(n-r) :"+factR);
        
        double Permutation = factN / factR;
        System.out.println("Permutation Is :"+Permutation);
    }
}
