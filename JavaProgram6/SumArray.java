public class SumArray {
    static int ArrayOfSum(int arr[], int idx){
        if(idx == arr.length) {
            return 0;
        }
        int smallAns = ArrayOfSum(arr, idx+1);
        return smallAns + arr[idx];
    }
    public static void main(String[] args) {
        int arr[] = {5,6,9,3,4};
        System.out.println(ArrayOfSum(arr, 0));
    }
}
