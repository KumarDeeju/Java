import java.util.Scanner;
public class StringwordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
       
        int count=0;
        char t=0;
        for(int i=0;i<st.length();i++){
            for(int j=i+1;j<st.length();j++){
                if(st.charAt(i).equals(st.charAt(j))){
                    count += c=st.charAt(i);
                     
                    System.out.println(count);
                
                }
            }
        }

        
    }
}
