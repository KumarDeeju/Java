public class Recursion2 {
    static int SumOfDigits(int n){
        if( n >= 0  &&  n <= 9) return n;
        return SumOfDigits(n/10) + n%10;
    }
    public static void main(String[] args) {
        System.out.println(SumOfDigits(189234));
    }
}
