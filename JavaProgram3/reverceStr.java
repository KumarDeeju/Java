
import java.util.Scanner;

public class reverceStr {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String st = sc.nextLine();
       StringBuilder sb = new StringBuilder(st);
       System.out.println(sb.reverse());
       
    }
}
