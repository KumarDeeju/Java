import java.util.Scanner;
// Method 1: Using if-else Statements 2
public class Pripinsta5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c){
            System.out.print(a+" <a> is Greater");
        }else if(b > c){
            System.out.println(b+" <b> is Greater");
        }else{
            System.out.println(c+" <C> c is Greater");
        }
    }
}
