// user to input
import java.util.Scanner;
public class Suby {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        int sub = a - b;
        System.out.println("Sub ="+sub);
    }
}