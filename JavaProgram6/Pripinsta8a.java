import java.util.Scanner;
public class Pripinsta8a {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int sum = 0;

        for(int i=0;i<=n.length();i++){
            sum += i;
        }
        System.out.print(sum);
    }
}
