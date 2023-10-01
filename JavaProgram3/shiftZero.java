import java.util.Arrays;
public class shiftZero {
    public static void main(String[] args) {
        int a[] = {0, 0, 45, 0, 0};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j] == 0 && a[j+1]  != 0){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
            }
        }
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
