import java.util.Scanner;

public class ArrayInFindElemenOfIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        int count=0;
        int val = sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i] == val){
                count  = i;
                System.out.println(i);  
                break;
            }else{
                System.out.println("no");
                break;
            }
        }
        // if(count >= 0){
        //     System.out.println("Element it found at index: "+count);
        // }else{
        //     System.out.println("Element is not found");
        // }
    }
}
