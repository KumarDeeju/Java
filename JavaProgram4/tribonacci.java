import java.util.Scanner;
public class tribonacci {
    public static void main(String[] args) {
        int term,a=0,b=1,c=2,T;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the term :");
        term = sc.nextInt();
        for(int i=0;i<=term;i++){
            System.out.print(a+" ");
            T=a+b+c;
            a=b;
            b=c;
            c=T;
        }
    }
}
