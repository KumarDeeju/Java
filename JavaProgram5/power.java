public class power {
    static int Power(int p, int q){
        if( q == 0 ) return 1;
        return Power(p, q-1) * p;
    }
    public static void main(String[] args) {
        System.out.println(Power(5,8));
    }
}
