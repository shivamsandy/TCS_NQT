// Given a string S, check whether it contains only digits (0-9).

public class _0025 {
    public static void main(String[] args) {

        String x =  "123456";
        for(char ch  : x.toCharArray()){
            if(!Character.isDigit(ch)){
                System.out.println("false");
                break;
            }else{
                System.out.println("true");
                break;
            }
        }
        
    }
    
}
