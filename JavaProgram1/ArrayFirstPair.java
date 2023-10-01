import java.util.Scanner;

public class ArrayFirstPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];

        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int ans = -1;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] == a[j]){
                    ans = a[i];
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
