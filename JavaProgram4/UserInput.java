import java.util.Scanner;
public class UserInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a = sc.nextInt();
        System.out.print("Enter the value of b :");
        int b = sc.nextInt();
        int Sum = a + b;
        System.out.println("Sum are :"+Sum);
    }
}