import java.util.Scanner;
public class Pripinsta7a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        // if(n < 2) return; 
        for(int i=m;i<n;i++){
            if((n % n == 0 && n % 1 == 0) && (n  % i == 0)){
                System.out.print(i+" ");
            }
        }
    }
}
