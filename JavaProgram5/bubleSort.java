public class bubleSort {
    public static void main(String[] args) {
        int[] a = {44, 56, 33, 22, 12};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<=a.length-i-1;j++){
                if(a[j] < a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            System.out.println(a[i]);
        }
    }
}
