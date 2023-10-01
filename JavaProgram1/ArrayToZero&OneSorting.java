import java.util.Scanner;

public class ArrayToZero&OneSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];

        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        
        int zero = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] == 0){
                zero++;
            }
        }
        // -1 to Zero(0) and zero se length(a.length-1) tak
        for(int i=0;i<a.length;i++){
            if(i < zero){
                a[i] = 0;
            }else{
                a[i] = 1;
            }
        }
        System.out.println(a[i]);
    }
}
