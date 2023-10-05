public class RecString {

    static void printOccuration(int n, String st){
        if(n == 1){
            System.out.println(st);
            return;
        }
        printOccuration(n-1, st);
        System.out.println(st);
    }
    public static void main(String[] args) {
        int n = 7;
        String st = "Hello";
        printOccuration(n, st);
    }
}
