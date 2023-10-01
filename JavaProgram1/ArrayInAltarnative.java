import java.util.Scanner;
import java.util.Arrays;

public class ArrayInAltarnative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = new int[arr.length];
        Arrays.sort(arr);
        int j=0,p=0;
        // 1 2 3 4 5
        int len = arr.length;
        int rht = arr[len-1];
        int lft = arr[0];
        for(int i=0;i<n;i+=2){
            if(lft >= rht){

                res[i] = arr[rht++];
                res[i+1] = arr[lft++];
                j++;
            }
            // p++;
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
