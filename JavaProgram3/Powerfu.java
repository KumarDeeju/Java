public class Powerfu {

    public static int CallPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        // int power = CallPower(x, n-1);
        // int result = x*power;
        // return result;

        if(n%2 == 0){
            int power = CallPower(x,n/2)*CallPower(x, n/2);
            return power;
        }else{
            int power1 = CallPower(x,n/2)*CallPower(x, n/2)*x;
            return power1;
        }
        
    }
    public static void main(String[] args) {
        int x = 25;
        int n = 2;
        int answer = CallPower(x,n);
        System.out.print(answer);
    }
}
