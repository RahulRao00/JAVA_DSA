package src.WEEK_1_ARRAY_2;
   
   public class L3_pairsArray {

    public static void printPairs(int arr[]) {
        
        for(int i=0;i<arr.length;i++){
            for(int j = i+1; j<arr.length; j++){
                System.out.println(arr[i] + " " + arr[j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8};
        printPairs(arr);  // calling function
        
    }
}
