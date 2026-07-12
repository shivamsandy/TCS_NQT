public class _0056 {
    public static void main(String[] args) {
        int a  =18;
        int b  = 27;
        System.out.println(gcd(a,b));
        int lcm  = (a*b)/gcd(a, b);

    }
    public static int gcd(int x,int y){
        while(y!=0){
            int temp = y;
            y=x%y;
            x=temp;
        }
        return x;
    }
    
}
