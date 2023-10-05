import java.util.Scanner;

public class LoopRange {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int k = -n/2;
         for(int i=n/2;i>=k;i--){
            if(i==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}


// OUTPUT IS : 
// 6
// 3 2 1 -1 -2 -3
