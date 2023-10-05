public class Method {
    // static method
    static void myMethodstatic(){
        System.out.println("static method call without create object");
    }
    // public method
    public void myMethodpublic(){
        System.out.println("public method in must be create main class to object");
    }
    public static void main(String[] args) {
        // for static method call
        myMethodstatic();
        // for public method call
        Method Obj = new Method();
        Obj.myMethodpublic();

    }
}
