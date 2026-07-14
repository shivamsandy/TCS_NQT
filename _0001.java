public class _0001 {
    public static void main(String[] args) {
        int arr[]  = {4,2,3,4,56,5,6,7,8,9};


        int largest  =  Integer.MIN_VALUE;
        int smallest  =  Integer.MAX_VALUE;

        for(int i  =0 ;i<arr.length;i++){
            if(arr[i]>largest){
                largest =  arr[i];
            }
            if(arr[i]<smallest){
                smallest  = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);

    }
    
}