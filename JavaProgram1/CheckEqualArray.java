import java.util.Arrays;
public class CheckEqualArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr1 = {3, 2, 1};
        Arrays.sort(arr);
        Arrays.sort(arr1);
        // boolean check = false;
        boolean check = Arrays.equals(arr, arr1);
        // check = true;
        for(int i=0;i<1;i++){
        if(check){
            System.out.println("Array are Equals");
        }else{
            System.out.println("No Equal");
        }
        }
        
    }
}
