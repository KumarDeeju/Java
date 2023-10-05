import java.util.Scanner;
public class ArraySumOfFirstN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int len = sc.nextInt();
        for(int i=0;i<len;i++){
            sum  += arr[i];
        }
        System.out.println(sum);
    }
}
