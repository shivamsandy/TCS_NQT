public class _0022 {
    public static void main(String[] args) {
        
        String  s = "Let's take LeetCode contest";

        String[] str  = s.split(" ");
        StringBuilder sb  =  new StringBuilder();

        for(int i=0;i<str.length;i++){
             String x =  reverse(str[i]);
             sb.append(x).append(" ");
    
        }

        String pk  = sb.toString().trim();

        System.out.println(pk);




    }
    public static String reverse(String s){
        char[] arr = s.toCharArray();
        int i=0;
        int j  =s.length()-1;
        while(i<j){
            char temp  = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }

}
