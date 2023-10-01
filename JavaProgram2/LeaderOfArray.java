import java.util.Scanner;
public class LeaderOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int count=0;
        boolean check = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[0] > arr[i+1]){
                // int m = arr[0];
                count++;
                check = true;
                // System.out.println(m);
            }
        }
        if(check){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
