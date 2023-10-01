import java.util.Scanner;
public class ArrayAlternateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
                arr[i] = sc.nextInt(); // 33 22 54 67 78
        }
        int m = 0;
        int[] arr2 = new int[size];
        for(int i=0;i<arr2.length;i+=2){
            arr2[i] = arr[m]; // 33 0 22 0 54
            m++;
        }int len = arr.length;
        for(int i=1;i<arr2.length;i+=2){
            arr2[i] = arr[len-1];
            len--;
        }
        for(int i=0;i<arr2.length;i++){
        System.out.print(arr2[i]+" ");
        }


        // int k = 0;
        // for(int i=arr.length-1;i>=;i++){
        //     arr2[k] = 
        // }
    }
}
