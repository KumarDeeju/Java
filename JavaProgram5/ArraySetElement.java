import java.util.Scanner;

public class ArraySetElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Etner tha Element : ");
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Index : ");
        int set = sc.nextInt();
        int get = set-1;
        if(set < a.length-1){
        System.out.println("Inter the SET Element : ");
        int ans = sc.nextInt();

        System.out.println("FInal Array of Result : ");
        for(int i=0;i<a.length;i++){
            if(i == get){
                a[i] = ans;
                
            }
            System.out.print(a[i]+" ");
        }
    }else{
        System.out.println(-1);
    }
        
    }
}
