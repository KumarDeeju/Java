publiic calss FibonacciRev2 {
    // yaha per function call hoga 
    static int mainFibonacci(int n){
        // base case
        if(n==0) return 0;
        // smallAns/recursive work(n-1)
        int smallAns = mainFibonacci(n-1);
        // self work
        return smallAns + n;
    }
    public static void main(String[] args) {
        System.out.println(mainFibonacci(5)); // call to function
    }
}