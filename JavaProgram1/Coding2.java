public class Coding2 {
    static void Show()  /* ise static variable kahte h. isko ham main function line no (7)se class ke thru call karenge */
    {
        System.out.println("show world");
    }
    public static void main(String[] args) {
        Coding2.Show(); /* yaha se ham satatic variable ko call karenge uske bad line no (4) hamar print ho jayega. */
        System.out.println("hello world");
    }

    
}
