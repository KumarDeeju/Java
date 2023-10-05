import java.util.Arrays;
public class TwoArrayOfMarge {
    public static void main(String[] args) {
        int[] a = {33, 45, 67, 22};
        int[] b = {78, 23,55};

    // length
        int al = a.length;
        int bl = a.length;

        int cl = al + bl;
         int[] c = new int[cl];

         for(int i=0;i<al;i++){
            c[i] = a[i];
         }
         for(int i=0;i<bl;i++){
            c[al+i] = b[i]; 
         }

        

    }
}
