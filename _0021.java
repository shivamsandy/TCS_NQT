public class _0021 {

    public static void main(String[] args) {
        String s  =  "shivamsandyvivekananda";
        char c  =  'a';
        int count =0;
        for(int i=0;i<s.length();i++){
            char ch  =  s.charAt(i);
            if(ch==c){
                count++;
            }
        }

        System.out.println(count);
    }
    
}
