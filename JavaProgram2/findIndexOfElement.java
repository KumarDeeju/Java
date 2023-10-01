
class Test{
    void findIndex(){
        int[] arr = {34, 28, 26, 28, 49};
        int target = 28;

        int sum = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                sum = i;
                break;
            }
        }
        System.out.println(sum);

    }
}

public class findIndexOfElement {
    public static void main(String[] args) {
        Test obj1 = new Test();

        obj1.findIndex();
    }
}
