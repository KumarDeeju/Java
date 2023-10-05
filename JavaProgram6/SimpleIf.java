import java.util.Scanner;
class Simpleif {
public static void main(String args[]) {
int a;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a:");
a = sc.nextInt();
if(a>10){
System.out.println("Number is positive");
}else {
System.out.println("Statement outside if block");
}
}
}