import java.util.Scanner;

public class GFG {

// Function to convert vowels to uppercase in a string
        
            public static String conVowUpp(String str) {
        
                // Convert the string to a character array
        
                char[] charArray = str.toCharArray();
        
                 
        
                // Iterate over each character in the array
        
                for (int i = 0; i < charArray.length; i++) {
        
                    // Check if the character is a lowercase vowel (a, e, i, o, u)
        
        if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u') {
        
        // Convert the lowercase vowel to uppercase by subtracting 32
        
        charArray[i] -= 32; // ASCII value of 'a' - ASCII value of 'A' = 97 - 65 = 32
        
        }
}
        
        
        // Convert the character array back to a string
        
        String result = new String(charArray);
        
        return result;
        
        }
        
        
        
        public static void main(String[] args) {
        
        String str = "eutopia";
        
        System.out.println(conVowUpp(str));
        
            }
        
        }
    

