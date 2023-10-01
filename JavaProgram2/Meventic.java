public class Meventic {
    public static void main(String[] args) {
        long a=95789945;
        String s = String.valueOf(a);
        int l=s.length();
        int highestno = 0;
        for(int i=0;i<l-1;i++){
            char b=s.charAt(i);
            char c=s.charAt(i+1);
            int e=Character.getNumericValue(b);
            int f=Character.getNumericValue(c);
            if(b!=c){
                int h=(e*10)+f;
                if(h>highestno){
                    highestno=h;
                }
            }
        }
        System.out.println(highestno);
    }
}
