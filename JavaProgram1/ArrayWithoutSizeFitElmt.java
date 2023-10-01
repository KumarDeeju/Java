import java.util.Scanner;
public class ArrayWithoutSizeFitElmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arr1 = new int[10+1];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        int target = sc.nextInt();
        int element = sc.nextInt();

        int k = arr.length-1;
        for(int i=arr1.length-1;i>=1;i--){
            arr1[i] = arr[k];
            if(k == target){

                arr1[k-1] = element;
            }
            k--;
        }
        
            for(int i=0;i<arr1.length;i++){
                System.out.print(arr1[i]+" ");
            }
}
}
