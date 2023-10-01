import java.util.Scanner;

public class asicii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        // int n = sc.nextInt();
        if(ch > 97 && ch < 122){
            System.out.print("Lower case latter");
        }else if(ch > 65 && ch < 90){
            System.out.println("Uper case latter");
        }else if(ch > 33 && ch < 48 || ch >= 58 && ch <= 64){
            System.out.println("special case letter");
        }else if(ch > 48 && ch <= 57){
            System.out.print("Number");
        
        }
    }
}
