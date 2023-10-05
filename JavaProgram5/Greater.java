import java.util.Scanner;
class Greater {
public static void main(String args[]){
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("put value of a");
a = sc.nextInt();
System.out.println("put value of b");
b = sc.nextInt();
System.out.println("put value of c");
c = sc.nextInt();
if(a>b){
if(c>a){
System.out.println("a is greater");
}
else{
System.out.println("c is greater");
}else if(b>c){
System.out.println("b is greater");
}
else
{
System.out.println("c is greater");
}
}
}
}

