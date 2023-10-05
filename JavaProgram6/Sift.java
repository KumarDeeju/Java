public class Sift {
    public static void main(String[] args) {
        System.out.println("Right shift--> :"+ (7>>28) ); // Answer- 0
        System.out.println("left shift--> :"+ (3<<2) ); // Answer- (3 * (2*2))
        System.out.println("XOR Operator--> :"+ (3^2) ); /*Answer- 1(3 of binary 11 and 2 of binary 10)
         then 1 1
              1 0
              similar is false so 1 0 is 1 */
        System.out.println("Bitwise Operator--> :"+ (3&2) ); // Answer- 2(here both are folse - false/ both are true -true)

    }
}
