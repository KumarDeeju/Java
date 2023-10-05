import java.util.Scanner;
import java.util.Arrays;

public class removeElement {
    static void  removeElement(int []n, int len, int value, int idx){
        if(idx >= len) return;
        if(n[idx] != value) {
            System.out.print(n[idx]+" ");
        }
        removeElement(n, len, value, idx+1);
    }
    public static void main(String[] args) {
       int n[] = {55, 65, 64, 55, 78};
       int value = 55;
       int len = n.length;
       removeElement(n, len, value, 0);
    }
}
