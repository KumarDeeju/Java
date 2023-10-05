import java.util.Scanner;
public class PripinstaAutomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem,sum = 0,dev;
        int n = sc.nextInt();
        int sqr = (n * n);

        rem = sqr % 10;

        if(rem == n){
            System.out.println("Automorphism");
        }else{
            System.out.println("Not");
        }
    }
}
