public class recursionToremoveArray {
    static void RemoveTargetValue(int[] a,int len, int target, int idx){
        // base case
        if(idx == len) return;
        // recursive case
        if(a[idx] != target){
            System.out.print(a[idx]+" ");
        }
            RemoveTargetValue(a, len, target, idx+1);

    }
    public static void main(String[] args) {
        int a[] = {33, 45, 22, 67, 80};
        int target = 22;
        int len = a.length;

        // for(int i=0;i<a.length;i++){
        RemoveTargetValue(a, len, 22, 0);
        // }
    }
}
