import java.util.Arrays;

public class ArrayRangOFsum {
    public static void main(String[] args) {
        int[] a = {55, 99, 56, 74, 40, 12, 85, 33, 50, 82};
        // for(int i=0;i<a.length;i++){
        //     for(int j=i+1;j<a.length;j++)
        //         arr
            // }
        // }

        Arrays.sort(a, 0, a.length-3);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
