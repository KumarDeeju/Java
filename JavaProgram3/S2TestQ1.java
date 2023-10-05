public class S2TestQ1 {

        public static String findBitwiseInfo(int N) {
            String binaryRepresentation = Integer.toBinaryString(N);
            int setBitsCount = binaryRepresentation.replace("0", "").length();
            int leastSignificantBit = binaryRepresentation.length() - 1 - binaryRepresentation.lastIndexOf('1');
            int mostSignificantBit = binaryRepresentation.indexOf('1')+3;
    
            return setBitsCount + "#" + leastSignificantBit + "#" + mostSignificantBit;
        }
    
        public static void main(String[] args) {
            int sampleInput = 9;
            String output = findBitwiseInfo(sampleInput);
            System.out.println(output);
        }
    }

