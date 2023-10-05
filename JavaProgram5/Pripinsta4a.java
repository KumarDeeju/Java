import java.util.Scanner;
// Method 2: Using Ternary Operator
public class Pripinsta4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.println("both are equal");
        }
        else{

        String ans = a > b ? "a- is greater" : "b- is greater" ;
        System.out.print(ans);
    }
}
        }

