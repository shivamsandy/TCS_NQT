public class _0058 {
    public static void main(String[] args) {
        System.err.println("reverse integer ");
        int  x =  -123;

        System.out.println(reverse(x));

    }
    public static int reverse(int x) {
        int sign = x<0 ? -1 : 1;
        x =  Math.abs(x);
        int ans  =0 ;

        while(x!=0){
            int ld =x%10;
            if(ans>(Integer.MAX_VALUE-ld)/10){
            return 0;
        }
            ans  = ans*10+ld;
            x=x/10;
        }
        return sign *ans;
        
    }
    
}
