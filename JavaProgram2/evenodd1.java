import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println("Even no is :"+a);
        }
        else {
            System.out.println("Odd no is :"+a);
        }
    }
}
