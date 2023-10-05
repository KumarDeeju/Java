import java.util.Scanner;

public class LoopNegativ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        System.out.println("Result Is in negative : ");
        for(int i=0;i>=n;i--){
            System.out.print(i+" ");
        }
    }
}
// OUTPUT IS : 
// Enter the n : 
// -7
// Result Is in negative : 
// 0 -1 -2 -3 -4 -5 -6 -7  
