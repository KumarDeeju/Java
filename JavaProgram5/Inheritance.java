class classA {
    int a = 10, b = 20;
}
class classB extends classA{
    void Sum(){
        int add=a+b;
        System.out.println("Addition is :"+add);
    }

}
class classC extends classA {
    void Product (){
        int mul= a*b;
        System.out.println("Product is :"+mul);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        classB b = new classB();
        classC c = new classC();
        b.Sum();
        c.Product();
        
    }
}
