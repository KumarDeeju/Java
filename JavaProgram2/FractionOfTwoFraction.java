import java.util.Scanner;
// fraction = (numinetor1 / denominator)  + (numinator2 / denominator)
// fraction = a/b + c/d
public class FractionOfTwoFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

       if(b == d){
        int denominator = b;
        int num = a + c;
       }else{
        int denominator = b * d;
        int num = (a*d) + (b*c);
       }
       double fraction = num / denominator;

       System.out.println("Fraction : "+fraction);
    }
}
