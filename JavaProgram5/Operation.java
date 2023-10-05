class Operation {
int square(int n) {
return n*n;
}
}
class Circle{
Operation op;
double pi=3.14;
double area(int radius){
op=new Operation();
int rsquare=op.square(radius);
return pi*square;
System.out.println("Square and circle are :"+Circle.square(2));
}

}
