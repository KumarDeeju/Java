import java.util.Scanner;

public class StringReapetingWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //StringBuilder sb = new StringBuilder();
        String str = sc.nextLine();
        
        // String low = str.toLowerCase();
        
        // System.out.println("Lower case : "+low);
        int count=0;
        String ans="";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                   count++;
                    ans += str.charAt(i);
                }
            }
         }
         if(count > 0){
            System.out.print(ans);
         }else{
            System.out.print("None");
         }
    }
}
