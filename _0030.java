
/*
Given a string S, replace every space ' ' with "%20".
*/

public class _0030 {
    public static void main(String[] args) {
        String S = "Mr John Smith";

        StringBuilder sb  =  new StringBuilder();
        for(char ch  : S.toCharArray()){
            if(ch  == ' '){
                sb.append("%20");
            }else{
                sb.append(ch);
            }
        }

        String str  =  sb.toString();
        System.out.println(str);
    }

    
}
