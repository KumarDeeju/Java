import java.util.Arrays;
public class mergeArray {
    public int mergeArays(int[] num1, int n1l, int[] num2, int n2l){
        int i = n1l;

        for(int j=0;j<n2l;j++){

            num1[i] = num2[j];
            i++;
        }

        Arrays.sort(num1);
    }
    public static void main(String[] args) {
        int[] num1 = {33, 32, 56, 22};
        int[] num2 = {23, 45, 19, 90};

        int n1l = num1.length;
        int n2l = num2.length;
       
        System.out.println(mergeArays(num1, n1l, num2, n2l));
        
       
    }
}
