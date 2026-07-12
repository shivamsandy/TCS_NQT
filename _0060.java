import java.util.ArrayList;
import java.util.List;

public class _0060 {
    public static void main(String[] args) {
        System.out.println("PASCAL TRIANGLE");

        int n  =5;
        List<List<Integer>> y  =  new ArrayList<>(pascal(n));
        
for (List<Integer> row : y) {
    for (int num : row) {
        System.out.print(num + " ");
    }
    System.out.println();
}
    }
    public static List<List<Integer>> pascal(int n){
        List<List<Integer>> result =  new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> row  =  new ArrayList<>();
            for(int j =0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    row.add(result.get(i-1).get(j-1) +result.get(i-1).get(j));
                }
            }
            result.add(row);

        }
        return result;
    }
    
}
