import java.util.Scanner;

public class stringMidle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = str.charAt(1);
        
        int num = Character.getNumericValue(ch);
        // int num = (int(ch))-48;   (i can use this line )
        if(num%5==0){ 
            System.out.println("Yes");
        }else{
            System.out.println("no");
        }
    }
}
