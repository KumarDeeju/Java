public class statcPublic {
    // static method
    static void myMethodstatic(){
        System.out.println("staic method call without create object");
    }
    // public method
    public void myMethodpublic(){
        System.out.println("public method of call must be create class to object");
    }
    public static void main(String[] args) {
        // for static call
        myMethodstatic();
        // for public call
        Main myObj = new Main();
        myObj.statcPublicpublic();

    }
}
