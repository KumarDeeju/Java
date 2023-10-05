import java.util.Scanner;
class Largest {
public static void main(String args[]){
int a,b,c;
Scanner object = new Scanner(System.in);
System.out.println("enter the value a:");
a = object.nextInt();
System.out.println("enter the value b");
b = object.nextInt();
System.out.println("enter the value c");
c = object.nextInt();
if(a>b && a>c) {
System.out.println("a is largest");
}
else {
if(b>a && b>c) {
System.out.println("b is Largest");
}
else {
System.out.println("c is largest");
}
}
}
}