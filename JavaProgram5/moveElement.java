public class moveElement{
    static int TargetAlpha(int[] a, int target){
        int len = a.length;
        int k = 0;
        for(int i=0;i<len;i++){
            if(a[i] != target){
              int temp = a[k];
              a[k] = a[i];
              a[i] = temp;
              k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int a[] = {22, 55, 12, 26, 22};
        int target = 22;
        System.out.println(TargetAlpha(a, 22));
        for(int i=0;i<=a.length;i++){
        System.out.print();
        }
    }
}