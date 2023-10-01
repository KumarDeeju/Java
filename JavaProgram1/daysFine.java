import java.util.Scanner;
public class daysFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >= 1 && n <= 5){
            System.out.println("Fine is 50 paise");
        }else if(n >= 6 && n <= 10){
            System.out.println("Fine is 1 rupee");
        }else if(n >= 11 && n <= 30){
            System.out.println("Fine is 5 rupees");
        }else {
            System.out.println("Membership Cancelled");
        }
    }
}
