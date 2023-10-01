import java.util.Scanner;
import java.util.Arrays;

public class Array1toNbetweenmins1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int len = arr.length;
        Arrays.sort(arr);
        int temp=arr[len-1];
        int[] result = new int[temp+1];
        for(int i=0;i<result.length;i++){
            result[i] = i; // 0 1 2 3.....result.length
        }
        int lan = result.length;
        int k=-1,l=0;
        for(int i=0;i<lan;i++){
            
                if(result[i] != arr[l]){
                    result[i] = k;
                }else{
                    result[i] = arr[l];
                    l++;
                }
        }
        for(int i=0;i<lan;i++){
            System.out.print(result[i]+" ");
        }
    }
}
