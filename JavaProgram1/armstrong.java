import java.util.Scanner;

public class armstrong {
    static void sumArmStrong(int n, int n.length){
        if(n > 0) return;
        int smallAns = sumArmStrong(n, n.length-1);
        return Math.pow(smallAns, n.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumArmStrong(n, n.length));
    }
}
