import java.util.Scanner;

public class WordInCharCOunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine().toLowerCase();
       char c = sc.next().charAt(0);

            int count=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i) == c){
                count++;

            }
        }
        System.out.println(count);

    }
}
