/*

VALID PALINDROME CHECK
*/

public class _0017 {
    public static void main(String[] args) {
        String s  = "A man, a plan, a canal: Panama";
        
        s= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

         System.out.println(checkplaindrome(s));
    }
    public static boolean checkplaindrome(String s){
        String x = new StringBuilder(s).reverse().toString();
        if(s.equals(x)) return true;
            else return false;
    }
    
}
