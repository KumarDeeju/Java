
// WITHOUT ARRAY USE FIND THE BIGEST NO;
import java.util.Scanner;

public class MaximumNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size : ");
        int size = sc.nextInt();
        int max = 0;
        System.out.println("Enter the element : ");
        int take;
        for(int i=1;i<=size;i++){
            take=sc.nextInt();
            if(max < take){
                max = take;
            }
        }
        System.out.println("Maximum No is : ");
        System.out.println(max);
    }
}

// OUTPUT IS --------------
// ENter the size :
// 5
// Enter the element :
// 56
// 88
// 34
// 90
// 13
// Maximum No is :
// 90