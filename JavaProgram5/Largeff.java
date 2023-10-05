import java.util.Scanner;
class Largeff {
public static void main(String args[]){
Scanner ob = new Scanner(System.in);
System.out.println("Enter value a:");
int a = ob.nextInt();
System.out.println("Enter value b:");
int b = ob.nextInt();
System.out.println("Enter value c:");
int c = ob.nextInt();
if(a<b){
System.out.println("b is greater");
}
if(b<c) {
System.out.println("c is greater");
}
else{
System.out.println("a is greater");
}
}
}
