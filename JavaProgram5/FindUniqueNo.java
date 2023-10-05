import java.util.Scanner;

public class FindUniqueNo {
    public static void main(String[] args) {
         int temp  = 0;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];

        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0;i<a.length-1;i++){
            for(int j=1;j<a.length;j++){
                if(a[i] != a[j]){
                    temp = 1;
                    break;
                }

            }
        }
        if(temp == 0){
            System.out.println(temp+"Yes");
        }else{
            System.out.println("NO");
        }
    }
}
