import java.util.Scanner;
import java.util.Arrays;

public class ArrayOfDecendingAndAcending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1; // 1 2 3 4 5 
            
        }
        int[] arr2 = new int[n*2];
        int sd = 0;
        for(int j=0;j<arr.length;j++){
            arr2[sd] = arr[j];
            sd +=2;
        }
       
        int t = 1;
        for(int k=arr.length-1;k>=0;k--){
            arr2[t] = arr[k];
            t+=2;
        }
        for(int ans : arr2){
            System.out.print(ans+" ");
        }
    }
}
