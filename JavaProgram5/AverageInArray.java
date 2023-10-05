import java.util.Scanner;

public class AverageInArray {
    public static void main(String[] args) {
      double []n = {20.2, 55.3, 44, 88};
      double sum = 0;
      int len = n.length;

      for(int i=0;i<len;i++){
            sum += n[i];
      }
      double avg = sum/len;
      System.out.println("Array of Average are :"+avg);
    }
}
