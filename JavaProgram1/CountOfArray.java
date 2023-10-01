import java.util.Scanner;

public class CountOfArray {
    static int findArrayCount(int[] a, int target){
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] == target){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int[] a = new int[size];
       
       for(int i=0;i<a.length;i++){
        a[i] = sc.nextInt();

       }
       int target = sc.nextInt();


       System.out.println(findArrayCount(a, target));
    
}
}