import java.util.Scanner;

public class ArrayInsert{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        

        for(int i=0;i< size;i++){
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        int get = pos-1;
        int set = sc.nextInt();
       if(arr.length-1 >= get){
        for(int i=0;i < arr.length;i++){
            if(i == get){
                arr[i] = set;
                
            }
            System.out.print(arr[i]+" ");

        // }if(){
        //     System.out.println(-1);
        }
    }else{
        System.out.println(-1);
    }
        
    }
}