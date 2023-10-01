import java.util.Scanner;
import java.util.Arrays;
public class ArrayPairMinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size;
        sc.nextInt();
        for(int i=0;i<n;i++){
            size = sc.nextInt();
            int[] arr = new int[size];
            for(int j=0;j<size;j++){
                arr[j] = sc.nextInt();
            }
            int min = 0;
            Arrays.sort(arr);
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            //     if(arr[j+1] - arr[j] < min){
            //         min = arr[j+1] - arr[j];
                }
            // }
            // System.out.println(min);
            // int temp = 0,min = 0,res=0;
            // boolean cheCkNo = true;
            // for(int j=0;j<arr.length;j++){
            //     for(int k=j+1;k<arr.length;k++){
            //         if(arr[j] > arr[k]){
            //             temp = arr[j] - arr[k];
            //         }else{
            //             temp = arr[k] - arr[j];
            //         }   
            //         cheCkNo = false;
            //         if(temp < res){
            //             min = temp;
            //         }
            //     }
            //     res = temp;
            // }
            // if(cheCkNo){
            //     System.out.print(res);
            // }else{
            //     System.out.println(min);
            // }
        }
    }
}
