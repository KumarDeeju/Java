import java.util.Arrays;
public class mergArray1 {
    public static void main(String[] args) {
        int[] a = {44, 23, 12, 67};
        int[] b = {45, 34, 98, 56};

        int al = a.length;
        int bl = b.length;

        int cl = al + bl;
        int[] c = new int[cl];

        for(int i=0;i<al;i++){
            c[i] = a[i];
        }
        for(int i=0;i<bl;i++){
            c[al+i] = b[i];
        }
        Arrays.sort(c);
        for(int i=0;i<cl;i++){
            
        
            System.out.print(c[i]+" ");
        }
        
    }
}
