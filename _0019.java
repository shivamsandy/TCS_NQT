/*

 check valid anagram

 */
import java.util.HashMap;
public class _0019 {
    
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        HashMap<Character,Integer> mp1= countchar(s);
        HashMap<Character,Integer> mp2= countchar(t);
        
        if( mp1.equals(mp2)){
            System.out.println(true);
        }else System.out.println(false);
    }
    public static HashMap<Character,Integer> countchar(String s){
        HashMap<Character,Integer> map  =  new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch  =  s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
        }
        return map;
    }
    
}
