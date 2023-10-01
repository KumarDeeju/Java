import java.util.Scanner;

public class Digitjacberat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String st = sc.nextLine(); //jhgg
        char[] arr = st.toCharArray();
        char temp;
        for(int i=0;i<arr.length;i+=2){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        } 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);   

        }
    }
}
