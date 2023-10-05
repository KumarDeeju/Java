import java.util.Scanner;
public class StringTraingle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //  "PROGRAM"
        for(int i=0;i<str.length();i++){
            //char ch = str.charAt(i);
            for(int j=0;j<=i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}