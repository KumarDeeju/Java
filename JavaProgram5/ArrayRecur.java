public class ArrayRecur {
    static void ResursionArray(int []arr, int idx){ // called method- parameter
        if(idx == arr.length){ // hear idx == arr.length(yaha par check kar rahe h array empty to nahi h)
            return; // yadi array empty h to return(back ho jao)
        }
        System.out.print(arr[idx]+" "); // yaha par arr[idx]--ka--meaning--> only 0(zero) index ko print karna. 
        ResursionArray(arr, idx+1); /* yaha par (arr, idx+1)--ka--meaning--> array me index 1 se end(last) 
        tak ko print karna*/
    }
    public static void main(String[] args) {
        int []arr = {20,8,6,14,23}; // yeh array ka element hai
        ResursionArray(arr, 0); // function/method defined hai
    }
}
