
public class string {
    public static void main(String[] args) {
            String str = "abcecd"; // target c
            char ans = 'c';
           
            for(int i=0;i< str.length();i++){
                if(str.charAt(i) == ans){
                    continue;
                }
                System.out.print(str.charAt(i));
            }
    }
}
