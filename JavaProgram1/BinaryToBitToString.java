import java.util.Scanner;

public class BinaryToBitToString {
    static String findUnique(int digit){
        // integer to binary
        String binary = Integer.toBinaryString(digit);
        // count the bite position
        int setBite = binary.replace("0", "").length();
        // string between set the integer
        int setNum = binary.length()-1-binary.lastIndexOf('1');

        // replace the binary
        int replaceBinary = binary.indexOf('1')+3;
        // return the special caracter

        return setBite + "#" + setNum + "#" + replaceBinary; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        String resutl = findUnique(digit);
        System.out.println(resutl);
    }
}
