import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String[] sr = st.split(", ");
        for(String sp : sr){
            System.out.println(sp);
        }
    }
}
