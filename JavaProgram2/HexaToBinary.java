import java.util.Scanner;

public class HexaToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
       int decimal = Integer.parseInt(st, 16);
       String sr = Integer.toBinaryString(decimal);
       System.out.print(sr);
    }
}
/*
 * HexaToBinary 
1AC5
1101011000101
 */