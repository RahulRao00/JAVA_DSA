  
    public class FunctionPassingArray {

    public static int changeNumber(int[] arr) {
        
        arr[0] = 100;
        System.out.println(arr[0]);
        return arr[0];

    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7};
        int ans = changeNumber(arr);
        

    }
        
    }
