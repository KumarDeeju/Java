public class PlusPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i == 3 || j == 3){
                    System.out.print(" X");
                }else{
                    System.out.print(" O");
                }
                
            }
            System.out.println();
        }
    }
}
