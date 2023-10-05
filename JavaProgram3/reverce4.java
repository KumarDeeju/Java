public class reverce4 {
    public static void Revers(String str,int m){
        if(m == -1){
            return;
        }
        System.out.print(str.charAt(m));
        Revers (str,m-1);
    }
    public static void main(String[] args) {
        String str = "RahulChutiya";
        Revers(str, str.length()-1);
    }
}
