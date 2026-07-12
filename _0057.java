public class _0057 {
    public static void main(String[] args) {
        int  x  =  1234567;
        int count  =0;
        while(x!=0){
            int ld  =  x%10;
            count++;
            x /=10;
        }
        System.out.println(count);
    }
    
}
