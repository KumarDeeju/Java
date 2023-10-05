import java.util.Scanner;
public class Pripinsta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0, rem;
        int temp = n;
        while(temp != 0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp/10;
        }
        if(n == rev){
            System.out.println("This is Palindrom.");
            
        }else{
            System.out.println("This is not a Palindrom.");
        }
        
    }
}
