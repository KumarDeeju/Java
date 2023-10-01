import java.util.Scanner;

public class prePinsta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==0){
            System.out.print("This no is Zero.");
        }else{
            String ans = n > 0 ? "This no is Positive." : "This no is Negative.";
            System.out.print(ans);
        }
    }
}
