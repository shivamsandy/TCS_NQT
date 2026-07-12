/*

16 Reverse a string
Easy
TCS, Wipro, ALL

*/

public class _0016 {
    public static void main(String[] args) {
        
        String str  = "Shivamsandy";
        System.out.println("Enter  String : "+str);

        ReverseString(str); //  manual method reverse

        
        String x =  new StringBuilder(str).reverse().toString(); //  short cut
        System.out.println(x);


 

        
    }
    public static void ReverseString(String s){
        char[] str  = s.toCharArray();
        int j  =s.length()-1;
        for(int i=0;i<j;i++){
            char temp  = str[i];
            str[i] = str[j];
            str[j] = temp;
            j--;
        }
        System.out.println(str);
    }
}
