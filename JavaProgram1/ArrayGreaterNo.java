import java.util.Scanner;

public class ArrayGreaterNo {
    public static void findLeaderNo(int[] arr, int size){
        int len = arr.length;
        int i,j;
        for(i=0;i<len;i++){
            boolean cheCkNo = true;
            for(j=i+1;j<len;j++){

                if(arr[i] < arr[j])
                {
                    cheCkNo = false;
                    break;
                }
            }if(cheCkNo == true){
                System.out.print(arr[i]+" ");
            }
        }
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    findLeaderNo(arr, size);
   }
}