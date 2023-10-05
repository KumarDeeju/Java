import java.util.Scanner;

public class FindGretest {
    public static void main(String[] args) {
        int n;
        int max=0;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=1;i<=size;i++){
            n = sc.nextInt();
            if(n > max){
                max = n;
            }
        }
        System.out.println(max);
    }
}
