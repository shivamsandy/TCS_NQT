import java.util.HashMap;

public class _0020 {
    public static void main(String[] args) {
            String s  =  "loveleetcode";
            char[] x  =  s.toCharArray();
            HashMap<Character,Integer> mp  =  new HashMap<>();

            
           for(char ch :x){
                mp.put(ch,mp.getOrDefault(ch,0)+1);
           }

           for(int i=0;i<s.length();i++){
            char c  =  s.charAt(i);
            if(mp.get(c)==1){
                System.out.println(i);
                break;
            }
        }


           
    }
    
}
