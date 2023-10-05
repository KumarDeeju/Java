public class recFact {
    static int printFact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * printFact(n-1);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(printFact(n));
    }
}
