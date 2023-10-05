public class Recursion {

static int MyResult(int n){
    if(n == 0 || n == 1) return n;

    return MyResult(n-1) + MyResult(n-2);
}

    public static void main(String[] args) {
        for(int i = 0;i<=5;i++)
        System.out.println(MyResult(i));
    }
}
