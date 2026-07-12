public class _0026 {
    public static void main(String[] args) {
        String s = "the     sky is blue   ";
        s  = s.trim().replaceAll("\\s+", " ");

        String[] str  = s.split(" ");

        for(String x : str){
            System.out.println(x);
        }


        int i=0;
        int j =str.length-1;
        while(i<j){
            String temp  = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }

        StringBuilder sb = new StringBuilder();

    for (String word : str) {
        sb.append(word).append(" ");
    }

    String result = sb.toString().trim();

    System.out.println(result);



    }
    //    String word[] = s.trim().split("\\s+");
    //     StringBuilder reverse = new StringBuilder();
        
    //     for(int i = word.length-1;i>=0;i--){
    //         reverse.append(word[i]);
    //         if(i!=0){
    //             reverse.append(" ");
    //         }
    //     }
    //     return reverse.toString();
        

    
}
