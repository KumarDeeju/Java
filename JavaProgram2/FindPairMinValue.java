import java.util.Scanner;
import java.util.Arrays;

public class FindPairMinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int j=0;j<size;j++){
                arr[j] = sc.nextInt();

            }
             Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int k=0;k<arr.length;k++){
            for(int j=k+1;j<arr.length;j++){
                int dif= arr[j] - arr[k];
                min = Math.min(min, dif);
            }
        }
        System.out.println(min);
        }
       
    }
}
