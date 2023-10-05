import java.util.Scanner;
// Method 3 : Using Bitwise Operator
public class prePinsta5 {

    static void isEven(int n){
        if(n == 0) return ;
        
        return (!(n & 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isEven(n)){
            System.out.print("This no is Even.");
        }else{
            System.out.print("This no is Odd.");
        }
    }
}
