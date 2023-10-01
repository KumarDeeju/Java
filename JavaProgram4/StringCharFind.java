import java.util.Scanner;

public class StringCharFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String sp = st.toLowerCase();
        System.out.println(sp);
        char c = sc.next().charAt(0);

        int count=0;
        for(int i=0;i<st.length();i++){
            if(sp.charAt(i) == c){
                count++;
            }
        }
        // count
        System.out.println(count);
    }
}
