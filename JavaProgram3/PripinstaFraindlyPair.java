import java.util.Scanner;
public class PripinstaFraindlyPair {
    public static void main(String[] args) {
        int fact1,fact2;
        int sum1=0,sum2=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i=1;i<n;i++){
            if (n % i  == 0) {
                sum1 += i;
            }  
        }
        for(int i=1;i<m;i++){
            if(m % i == 0){
                sum2 += i;
            }
        }
        // System.out.println("sum1 is :"+sum1);
        //  System.out.println("sum2 is :"+sum2);
        if(n/sum1 == m/sum2){
            System.out.println("Borth are Fraindly Pair");
        }else{
            System.out.println("Both are not Fraindly pair");
        }
    }
}
