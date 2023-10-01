import java.util.Scanner;

public class ArraySumTripleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        

        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    if(a[i] + a[j] + a[k] == x){
                        
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
