import java.util.Arrays;

public class removeInt {
      static int removeElement(int[] nums, int val) {
         int temp;
        int len = nums.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(nums[j] != val){
                    temp = nums[j];
                
                }
            }
        
    }
    public static void main(String[] args) {
        int arr[] = {23, 24, 12, 24, 56};
        int val = 24;
        for(int i=0;i<arr.length;i++){
       System.out.print(removeElement(arr, 24));
    } 
}
}