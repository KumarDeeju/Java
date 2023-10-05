public class sort {
    public static String[] findSubsequence(String str) {
        if(str.length() == 0)  { // yadi string ka length 0 ke barabar hoga 
            String ans[] = {""}; // to  yaha pe empty("") dega 
            return ans; // nahi to return answer me ans hi dega
        }
        String smallAns[] = findSubsequence(str.substring(1));/*  yadi uper wale me length 0 nahi hga to. is line
        yaha is line me index one(1) se check karenge */
        String ans[] = new String[2 * smallAns.length]; /* is line me size ko double karenge next substring ke leye */

        int k = 0;
        for(int i = 0;i<smallAns.length; i++){ /*  is line me 'i' ke value ko '0'(zero) se start karenge
         */
            ans[k] = smallAns[i]; // yaha pe yadi line ->12 pass hoga to ans [k] me store karenge 
            k++; // is line me jaha line => 11 me k == 0 hai. is line me k ke value ko increase karenge 1 by 1.
        }
        for(int i = 0; i< smallAns.length; i++){ 
            // ans[i + smallAns.lenght]
            ans[k] = str.charAt(0) + smallAns[i];
            k++;
        }
        return ans;
    }
     public static void main(String[] args) {
         String str = "xyz";
         String ans[] = findSubsequence(str);
         for(int i = 0; i<ans.length;i++){
            System.out.println(ans[i]);
         }
    }
}
