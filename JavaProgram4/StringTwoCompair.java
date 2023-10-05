import java.util.*;

public class StringTwoCompair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            String[] spl = str.split(" ");
            String s1 = spl[0];
            String s2 = spl[1];
            System.out.println(s1.equals(s2));
        }
    }
}
