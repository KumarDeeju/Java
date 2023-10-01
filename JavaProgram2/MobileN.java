import java.util.Scanner;

public class MobileN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String no = sc.next();
        int st = 0;
        int count = 0;
       boolean check = false;
        if(no.length()>=10){
            for(int i=0;i<no.length();i++){
                if(no.charAt(i)-'0' >= 0 && no.charAt(i)-'0' <= 9){
                //check = true;
                count++;
                  st = no.charAt(i)-'0';
                    
                }
            
            }

        }
        if(count == no.length()){
            System.out.println("valid no");
        }else{
            System.out.println("No valid");
        }
    }
}
