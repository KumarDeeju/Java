import java.util.Scanner;

public class sumdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = sc.nextInt();
        int size = n + count;
        int sum=0;
        for(int i=n;i<size;i++){
            sum += i;
            
        }
        System.out.print(sum);
    }
}
