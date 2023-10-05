public class StringP {
    public static void main(String[] args) {
        String st = "PROGRAM";
    //    char ch = st.charAt(0);
        for(int i=0;i<st.length();i++){
           for(int j=0;j<=i;j++){
                System.out.print(st.charAt(j));
            }
            System.out.println();
        }
    }
}
