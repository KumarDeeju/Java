import java.util.Scanner;
// Method 1: Using if-else Statements
public class Pripinsta4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.println("Both are Equal.");
        }
        else if(a < b) {
            System.out.print("b is Greater :"+b);
        }else  {
            System.out.println("a is greater :"+a);
        }
    }
}
