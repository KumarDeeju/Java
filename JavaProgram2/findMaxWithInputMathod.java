import java.util.Scanner;

class MaxVlaue{
    static void findMax(int[] a, int size){
        int sum=0;
        
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
            if(a[i] > sum){
                sum = a[i];
            }
        }
        System.out.println("Max : "+sum);
        
    }
}

public class findMaxWithInputMathod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxVlaue obj1 = new MaxVlaue();
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        obj1.findMax(a, size);
    }
}
