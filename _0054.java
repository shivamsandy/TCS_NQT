public class _0054 {
    public static void main(String[] args) {
        int n=6;

        // int p  = fibo(n);
        // System.err.println(p);

        // ITERATIVE WAY 
        int a  =0 ;
        int b=1;
        
        if(n==0)System.err.println(0);
        for(int i=2;i<=n;i++){
            int c  =  a+b;
            a=b;
            b=c;
        }
 
        System.out.println(b);




    }
    // public static int fibo(int x){
    //         if(x==0 || x==1) return x;

    //     return fibo(x-1)+fibo(x-2);
    // }
}
