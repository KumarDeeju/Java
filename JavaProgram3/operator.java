import java.util.Scanner;

public class operator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char opt = sc.next().charAt(0);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;
        int rem = a % b;
        if(opt == '+'){
            System.out.print(sum);
        }else if(opt == '-'){
            System.out.print(sub);
        }else if(opt == '*'){
            System.out.print(mult);
        }else if(opt == '/'){
            System.out.print(div);
        }else if(opt == '%'){
            System.out.print(rem);
        }
    }
}