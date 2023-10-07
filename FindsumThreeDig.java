import java.util.Scanner;

public class FindsumThreeDig {

    public static void findMax(int[] arr, int n, int k){
        if(k > n){
            
          System.out.println("Invalid");
        return;
        } 

        int max=0;
        for(int i=0;i<k;i++){ // 100 200 300 400
            max += arr[i];
        }
        int crtsum = max;
        for(int i=k;i<n;i++){
            crtsum += arr[i] - arr[i-k];
            max = Math.max(max, crtsum);
        }
       System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int k1 = sc.nextInt();
        int n1 = arr.length;
        // int result = 
        findMax(arr, n1, k1);

        
        
    //  System.out.println(result);
    }
}
