import java.util.Scanner;

public class ArrayESEC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //int temp;
        System.out.println("Enter ");
        int size = sc.nextInt();
        int n[] = new int[size];
        int len = n.length;
        // int find = sc.nextInt();
        for(int i=0;i<len;i++){
            n[i] = sc.nextInt();
        } // 4(size) 
         // 30 30 30 30 YES / 30 30 40 NO
        //for(int i=0;i<=len-1;i++){
        for(int j=1;j<len-1;j++){ 
            if(n[0] != n[j]){
                    
                    System.out.println("no");
                    break;
                }else{
                    System.out.println("Yes");
                    break;
               }

            }

    
    }
}
