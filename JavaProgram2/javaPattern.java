import java.util.Scanner;

public class javaPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        for(int i=1;i<=text.length();i++){
            System.out.println(text.substring(0, i));
        }
    }
}
