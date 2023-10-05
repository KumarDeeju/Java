import java.util.Scanner;
class Evenodd1 {
public static void main(String args[]){
Scanner ob = new Scanner(System.in);
System.out.println("Enter the value of a:");
int a = ob.nextInt();
if(a%2==0) {
System.out.println("even no.="+a);
}
else {
System.out.println("odd no.="+a);
}
}
} 