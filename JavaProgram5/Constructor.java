public class Constructor {
    int x,y,z; // atribute of main class

    // create a constructor for main class
    public Constructor(){
        x = 5;
        y = 6;
        z = x * y;
    }

    public static void main(String[] args) {
        Constructor myObj = new Constructor();
        System.out.println(myObj.z);
    }
}
