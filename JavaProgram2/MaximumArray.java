class ArrayExample{

    void findMaxmumArray(){
        int[] arr = {24, 75, 33, 55};
        int ans = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println(ans);
        
    }
}


public class MaximumArray {
    public static void main(String[] args) {
        ArrayExample ob1 = new ArrayExample();
        
        ob1.findMaxmumArray();
    }
}
