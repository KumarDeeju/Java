import java.util.Scanner;

public class Array23 {
    public static void main(String[] args) {
        int a[] = new int[5];int max;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter teh value :");
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.print("Maximum element :"+max);
    }
    
}
