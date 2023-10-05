class findMax{
    void Myaxpariment(){
        int[] arr = {345, 230, 34, 110, 440};
        int sum=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > sum){
                sum = arr[i];
            }
        }
        System.out.println(sum);
    }
}

public class findToMethodcallMaximumNo {
    public static void main(String[] args) {
        findMax ob1 = new findMax();
        ob1.Myaxpariment();
    }
}
