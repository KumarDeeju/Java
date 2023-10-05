import java.util.Scanner;

public class StringCompair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inum1 = sc.next();
        String inum2 = sc.next();

        boolean check1 = (inum1.equals(inum2));
        System.out.println("inum1 && inum2 = "+check1); 


        if(inum1 != inum2 || inum1 == inum2){
       
        System.out.println("inum1 || inum2 = "+"true"); 
        }

        if(inum1 != inum2){
        System.out.println("!inum1 = "+"false"); 
        }else{
            System.out.println("inum1 && inum2 ="+check1); 
        }



        
    }
}
