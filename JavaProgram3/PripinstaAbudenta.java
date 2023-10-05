import java.util.Scanner;

public class PripinstaAbudenta {
    public static void main(String[] args) {
        int fact,sum=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<n;i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if(n < sum){
            System.out.println(n+" -is an Abudant Numbers.");
            System.out.println("The Abudant is :"+(sum - n));
        }else{
            System.out.println(n+" -is not an Abudant No.");
        }
        
    }
}
