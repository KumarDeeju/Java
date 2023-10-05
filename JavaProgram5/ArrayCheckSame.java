import java.util.Scanner;
public class ArrayCheckSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int equal=0;
        for(int j=0;j<arr.length;j++){
        for(int i=j+1;i<arr.length;i++){
            if(arr[j] == arr[i]){
                equal++;
                break;
            }
        }
    }
        if(equal == arr.length-1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
