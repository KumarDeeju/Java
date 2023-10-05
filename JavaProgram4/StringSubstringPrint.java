import java.util.Scanner;

public class StringSubstringPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=2;i<str.length();i++){
            System.out.println(str.substring(i));
        }
    }
}
