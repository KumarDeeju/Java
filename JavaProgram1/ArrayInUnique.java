import java.util.Scanner;

public class ArrayInUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];

        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        int ans = -1;
        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] == a[j]){
                    a[i] = -1;
                    a[j] = -1;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i] > 0){ // if(a[i] != 0)
                System.out.println(a[i]);
            }
        }
    }
}
