import java.util.Scanner;
public class Pripinsta16 {
    public static void main(String[] args) {
        int prime, perfect=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            prime = n % i;
            perfect += i; 
        }
        System.out.print(perfect);
         
    }
}
