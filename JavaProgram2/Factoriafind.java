import java.util.Scanner;
public class Factoriafind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int k = 0;
        int temp=0;
        for(int j=1;j<=n;j++){
             k = j;
             temp = k;
        while(k > 0){
            int rem = k % 10;
            int fact = 1;
            for(int i=1;i<=rem;i++){
                 fact *= i;
            }
            sum += fact;
            k /= 10;
        }
    }
        if(sum == temp){
            System.out.print(sum);
        }else{
            System.out.print("Not Perfect No");
        }

    }
}
