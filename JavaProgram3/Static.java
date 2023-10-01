public class Static {
    int a = 10;
    static int b = 20;
    public static void main(String[] args) {
        
        Static r = new Static();
        r.What();
        Static.Show();
    }
    static void Show() {
        System.out.println("Show:"+b);
    }
    void What(){
        System.out.println("What :"+a+" "+b);
    }
}
