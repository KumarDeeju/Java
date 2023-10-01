public class ArrayRecursion {
    static void ArraPrint(int[] arr, int idx){
    // base case 
    if( idx == arr.length) return;
    // self work
    System.out.print(arr[idx]+" ");
    // recursion work
    ArraPrint(arr, idx+1);
}
    public static void main(String[] args) {
        int[] arr = {8,3,7,9,3};
        ArraPrint(arr, 0);

    }
}