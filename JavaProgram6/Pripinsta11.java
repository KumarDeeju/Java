import java.util.Scanner;
public class Pripinsta11 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int res = 0,rem;

        while(temp != 0){
            rem = temp % 10;
            res = res + (rem * rem * rem);
            temp = temp/10;
        }
        if(res == n){
            System.out.print(n+" is number Armstrong.");
        }else{
            System.out.print(n+" is number not Armstrong.");
        }
    }
}
