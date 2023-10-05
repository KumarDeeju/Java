
import java.util.Scanner;

public class HexaToBinary000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = hexToBinary(str.trim());
        System.out.println(ans);
        sc.close();
    }
    public static String hexToBinary(String hexString) {
        String Result = "";
        int len = hexString.length();
        for (int i = 0; i < len; i++) {
            char hexChar = hexString.charAt(i);
            String binaryChar = Integer.toBinaryString(Integer.parseInt(String.valueOf(hexChar), 16));
            while (binaryChar.length() < 4) {
                binaryChar = "0" + binaryChar;
            }
            Result += binaryChar;
        }
        return Result;
    }
}
/*
 * HexaToBinary000 
Enter a hexadecimal number: 1A 1AC5
Binary representation: 0001101101011000101
 */
 
