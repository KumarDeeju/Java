public class Power2 {
    static int Squar(int p, int q){ 
        // base case
        if(q == 0) return 1;

        // small value
        int SmallValue = Squar(p, q/2);
        if(q % 2 == 0){
            return SmallValue * SmallValue;
        }
        // self work
        return p * SmallValue * SmallValue;
    }
    public static void main(String[] args) {
        System.out.println(Squar(5, 4));
    }
}
