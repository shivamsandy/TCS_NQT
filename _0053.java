import java.util.Scanner;

public class _0053 {
    public static void main(String[] args) {
        System.out.println("CHECK PRIME   \n");
        Scanner  sc =  new Scanner(System.in);
        int x  =  sc .nextInt();
        
        boolean flag  =  true;
        if(x<1){
            System.err.println("not prime");
        }else{
            for(int i=2;i<=x/2;i++){
                if(x%2==0){
                    flag =false;
                }
            }
        }
        if(flag){
            System.err.println("is prime");
        }else{
            System.err.println("not prime");
        }

    }
    
}
