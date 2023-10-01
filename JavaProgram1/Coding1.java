public class Coding1 {
    void show(){
        System.out.println("show word"); /*isko print karne ke liey main function se call karenge*/
    }
    public static void main(String[] args) {
        Coding1 ref = new Coding1(); /* line no 3 ko print karne ke liye class name ko uska(3) rafrence bana padega (object)*/
        ref.show(); /* ab yaha se class ka object(ref) se normal function ko call karenge kyoki line no(3) uske under me ata h. */
        System.out.println("Hello world");
    }
    
}
