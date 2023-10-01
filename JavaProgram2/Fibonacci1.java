public class Fibonacci1 {
   public static void call(int a,int b,int n){
    if(n==0){
        return;
    }
    int c = a + b;
    System.out.print(c+" ");
    call(b, c, n-1);
   }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 200;
        System.out.print(a+" ");
        System.out.print(b+" ");
        call(a, b, n-2);
    }
}
