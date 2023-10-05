import java.util.Scanner;

public class SumTwoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int n = Integer.parseInt(s1, 2);
        int m = Integer.parseInt(s2, 2);
        int z = n + m;
        System.out.print(Integer.toBinaryString(z));
    }
}
