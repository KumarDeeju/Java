public class finddivarray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 15, 50, 120};
        int ans = -1;
        for(int i=0;i<arr.length;i++){
           int count = 0;
            for(int j=0;j<arr.length-2;j++){
            if(arr[j] % arr[i]==0){
                count++;
            }
                if(count == arr.length-2){
                    ans=arr[i];
            }
        }
    }
        System.out.print(ans);
}
}