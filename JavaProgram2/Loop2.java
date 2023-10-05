import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] n = new int[size];
        for (int i=0;i<=size;i++){
            n[i] = sc.nextInt();

            if(n[i] % 3==0 && n[i] % 5==0){
                System.out.println("FooBar ");
            }else if(n[i] % 3 == 0){
                System.out.println("Foo ");
            }else if(n[i] % 5 == 0){
                System.out.println("Bar ");
            }else{
                System.out.println("None ");
            }
        }
    }
}
