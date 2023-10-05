public class ReactanglePattern {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i == m|| j == n || i == 1 || j == 1 ){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
