import java.util.Scanner;

public class ArrayFirstAndLastOfSumEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum=0;
         for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int l = arr[0];
        int r = arr[arr.length-1];
        //int l2 = arr[r-1];
        for(int i=0;i<arr.length;i++){
            sum = l + r;
        }
        if(sum % 2 == 0){
            System.out.println(sum+"\nEVEN");
        }else{
            System.out.println(sum+"\nODD");
        }
    }
       
}
