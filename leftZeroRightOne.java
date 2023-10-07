/* PROBLEM
 You are given an array of Os and 1s in random order. Segregate Os on left side and 1s on right side of the array. Traverse array only once.
Input Format
N- size of the array 'N' integers(0 or 1)
Constraints
First line- N, array length Next N inputs- array elements(only O's and 1's)
Output Format
Input array in left-right arrangement
Sample Input 0
arr size = 5
0 1 2 0 1
Sample Output  = Invalid Input
 */
import java.util.Scanner;
import java.util.Arrays;

public class leftZeroRightOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(num != 0 && num != 1){
                System.out.println("Invalid Input");
                return;
            }
            arr[i] = num;
        }

        int left = 0;
        int right = n-1;
        while(left < right){
            while(arr[left] == 0 && left < right){
                left++;
            }
            while(arr[right] == 1 && left < right){
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

/*
 SIZE = 5
INPUT : 0 1 1 0 1
OUTPUT : 0 0 1 1 1 
 */