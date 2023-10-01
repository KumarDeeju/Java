import java.util.Scanner;

public class checkNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 17 && n < 33){
            System.out.print("YES");
        }else if(n == 17){
            System.out.print("boundary");
        }else {
            System.out.print("NO");
        }
    }
}
