public class resyrsuion2 {
    static int SumOfDigits(int n){
        if(n >= 0 && n <= 9) {
            return n;
        }
        int smallValue = SumOfDigits(n/10);
        int LastValue = SumOfDigits(n%10);
        int ans  =  smallValue + LastValue;
        return ans;        
    }

    public static void main(String args[]){
        System.out.println(SumOfDigits(123456));
    }
}
