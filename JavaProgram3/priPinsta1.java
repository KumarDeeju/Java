import java.util.Scanner;

public class priPinsta1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.print("This no is Negative.");
        }else if(n > 0){
            System.out.print("This no is positive.");
        }else{
            System.out.print("This no is Zero.");
        }
    }
}
