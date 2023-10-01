import java.util.Scanner;
public class binarydkf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem,sum=1;

        while(n > (-1)){
            rem = n % 10;
            if(rem == 0){
                rem = 1;
            }
            sum *= 10 + rem;
            n /= 10;
        }
        System.out.println(sum);
    }
}
