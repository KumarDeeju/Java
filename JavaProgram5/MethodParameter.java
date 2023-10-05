public class MethodParameter {
    static void Method1(){
        System.out.println("Student 1 ==>");
    }
    public void Method2(String Name){
        System.out.println("Student Name is :"+ Name);
    }
    public static void main(String[] args) {
        // static call
        MethodParameter myObj2 = new MethodParameter();
        myObj2.Method1();
        // public call
        MethodParameter myObj = new MethodParameter();
        myObj.Method2("Arjun");
    }
}
