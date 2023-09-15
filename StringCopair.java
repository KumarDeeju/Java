public class StringCopair{
    static int findOccOfIndex(String st, String sr){
        int len1 = st.length();
        int len2 = sr.length();
        if(st.length() < sr.length()){
            return -1;
        }
        for(int i=0;i<len1-len2+1;i++){
            if(st.charAt(i) == sr.charAt(0)){
                if(st.substring(i, sr.length()+i).equals(sr)){

                    return i;
                }
            }
        }
        return -1;
    } 
    public static void main(String[] args) {
        String st = "leetcode";
        String sr = "leeto";
        System.out.println(findOccOfIndex(st, sr));
    }
}