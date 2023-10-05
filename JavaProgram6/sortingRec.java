import java.util.Arrays;
public class sortingRec {
    static void RecToSorting(int []a){
        int n = a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {9, 4, 6, 2, 7, 4};
        RecToSorting(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
