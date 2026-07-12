public class _0059 {
    public static void main(String[] args) {
        int x  =153;
        int p=x;
        int ans  = 0;
        while(x!=0){
            int ld  = x%10;
            ans +=ld*ld*ld;
            x /=10;
        }
        if(ans==p){
            System.out.println("amstrong no");
        }else {
            System.err.println("not amstrong");
        }
    }
    
}
