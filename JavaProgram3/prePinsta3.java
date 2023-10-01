import java.util.Scanner;
// Method 1 : Using Brute Force
public class prePinsta3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0){
            System.out.print("This no is Even.");
        }else{
            System.out.print("This no is Odd.");
        }
    }
}
