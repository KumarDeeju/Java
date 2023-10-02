import java.util.Scanner;

public class reversetheStr {

    static String printRevStr(String st){
        char[] ch = st.toCharArray();
        int left = 0,end = ch.length-1;

        while(left < end){
            if(!Character.isLetter(ch[left])) left++;
            else if(!Character.isLetter(ch[end])) end--;
        else{
            char temp = ch[left];
            ch[left] = ch[end];
            ch[end] = temp;
            left++;
            end--;
        }
    }
    return  String.valueOf(ch);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = printRevStr(str);
        System.out.println(ans);
}}

/*
 * INPUT : i* love java Coding
    OUTPUT : g* nido Cava jevoli
 */