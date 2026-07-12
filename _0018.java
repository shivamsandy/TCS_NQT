public class _0018 {
    public static void main(String[] args) {
        String s  =   "i am  shivamsandy";
        s=s.toLowerCase();

        int vowel =0;
        int consonent  =0;

        for(int i =0;i<s.length();i++){
            char ch  = s.charAt(i);
            if(ch>='a'  && ch <='z'){
                if(ch=='a' || ch=='e' || ch =='i' || ch =='o' || ch=='u'){
                    vowel++;
                }else{
                    consonent++;
                }
            }
        }
        System.out.println(vowel);
        System.out.println(consonent);













    }
}
