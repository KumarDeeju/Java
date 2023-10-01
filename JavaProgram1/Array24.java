import java.util.Scanner;

public class Array24 {
    public static void main(String [] args){
        int a[] = new int[5]; int min;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        min=a[0];
        for(int i=1;i<a.length;i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        System.out.println("Smallest value :"+min);
    }
    
}
