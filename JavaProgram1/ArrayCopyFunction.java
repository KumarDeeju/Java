import java.util.Arrays;
class copyFunction{
    static void copyMethod(int[] arr){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println("Second Array");
        int[] arr_2 = Arrays.copyOf(arr, arr.length);
        // int[] arr_2 = Arrays.copyOf(arr, arr.length);
        int[] arr_2 = Arrays.copyOfRange(arr,2, arr.length);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr_2[i]+" ");
        }
    }
}
public class ArrayCopyFunction {
    public static void main(String[] args) {
        
        int[] arr = {33, 23, 45, 12, 22};

        copyFunction obj1 = new copyFunction();

        obj1.copyMethod(arr);
    }
}
