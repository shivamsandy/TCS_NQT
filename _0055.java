public class _0055 {
    public static void main(String[] args) {
        int n  =5;
        int fact  =1;
        for(int i=1;i<=5;i++){
            fact *=i;
        }
        System.out.println(fact);

        int p  = factorial(n);
        System.err.println(p);
    }
    public static int factorial(int n){
        if(n==1) return 1;

         
        return n*factorial(n-1);
    }
    
}
