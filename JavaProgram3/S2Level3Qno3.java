import java.util.Scanner;

public class S2Level3Qno3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
         int n = sc.nextInt();
         int ans = 0;
         while(n > 0){
            int rem = n % 10;
            int dig = (rem + 5) % 10;
            sb.append(String.valueOf((ans * 10) + dig));
            n /= 10;
         }
        
         String st = sb.toString();
         char[] ch = st.toCharArray();
         char temp;
         for(int i=0;i<ch.length;i+=2){
            temp = ch[i];
            ch[i] = ch[i+1];
            ch[i+1] = temp;
         }
         int idx = 0;
         for(int i=0;i<ch.length;i++){
            if(ch[i] != '0'){
                idx = i;
                break;
            }
        }
             for(int i=idx;i<ch.length;i++){
                System.out.print(ch[i]);
            }
         
    }
}
