import java.util.Scanner;

public class Array16 {
   public static void main(String[] args) {
        int a[] = new int[5];
        int n,i,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value :");
        for(i=0;i<a.length;i++){
            a[i] = sc.nextInt();
    }
            System.out.println("Array is :");
            for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nSearch Value of n:");
        n = sc.nextInt();
        for(i=0;i<a.length;i++){
            if(a[i]==n){
                count++;
            }
        }
        if(count>0){
            System.out.println("found it :"+count);
        }else{
            System.out.println("not found");
        }
   } 
}
