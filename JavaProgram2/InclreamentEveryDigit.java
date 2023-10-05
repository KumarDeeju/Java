import java.util.Scanner;

public class InclreamentEveryDigit {
    static String IncrementDigit(int dig){
        StringBuilder sb = new StringBuilder();
        while(dig > 0 ){
            int rem = dig % 10;
            sb.append(rem + 1);
            dig /= 10;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dig = sc.nextInt();
       
        String st = IncrementDigit(dig);
        System.out.print(st);
    }
}
