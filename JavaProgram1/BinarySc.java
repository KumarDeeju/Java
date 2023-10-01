import java.util.Scanner;

public class BinarySc {
    static void printBinary(Scanner sc){
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            String binry = Integer.toBinaryString(i);
            System.out.print(binry+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            printBinary(sc);
        }
    }
}
