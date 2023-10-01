import java.util.Scanner;
import java.util.Arrays;

public class ArrayZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        } // 31 32 33 34 35 INPUT
          // 31 33 32 35 34 OUTPUT
        int temp=0;
        for(int i=0;i<arr.length-2;i+=2){
            temp = arr[i+1];
            arr[i+1] = arr[i+2];
            arr[i+2] = temp;
            }
           for(int i=0;i<arr.length;i++){
            System.out.print(Arrays.toString(arr));
            break;
        }
    }
}
