public class FactorialRev1 {
    static int mainFactor(int n){
        // base case
        if( n == 0) return 1;
        // recursive case/small answer(n-1)
        int smallAns = mainFactor(n-1);
        // self work
        return smallAns * n;
    }
    public static void main(String[] args) {
        System.out.println(mainFactor(5));
    }
}
