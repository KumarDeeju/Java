import java.util.Scanner;

public class AlphaBita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int n = sc.nextInt();
        if(n<=10 && c<='C'){ // || ((n>=10 && 30>=n) || c<='C'))
            System.out.println("ALPHA");
        }  else if((n >10 && 30 >= n) && (c>='D' && c<='R')){
            System.out.println("BETA");
        }else if((n>=1 && n<=10) && (c >= 'D' && c<='R')){
            System.out.println("GAMMA");
        }else if((n >=10 && 30 >= n) && c<='C'){
            System.out.println("DELTA");
        } else {//if((c >= 'R' && c<='Z') && (n >=30 && n<=100)){
            System.out.print("OMEGA");
        }
              
    }
}
