import java.util.Scanner;
class Evenodd {
public static void main(String args[]){
int a;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of a:");
a = sc.nextInt();
if(a%2==0){
System.out.println("this no is even");
}else{
System.out.println("this no is odd");
}
}
}
