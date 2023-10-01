public class FirstString {
    public static void main(String[] args) {
        String abc = "abcdefccghcccij";
        for (int i=0;i< abc.length();i++){
            if ( abc.charAt(i) == 'g'){ // target c
                continue; // char 
            }
            System.out.print(abc.charAt(i));
        }
    }
}
