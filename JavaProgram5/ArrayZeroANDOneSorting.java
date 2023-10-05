import java.util.Scanner;

public class ArrayZeroANDOneSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int Zero = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                Zero++;
            }
        }
        // -1 to zero and zero to length-1
        for(int i=0;i<arr.length;i++){
            if(i < Zero){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
