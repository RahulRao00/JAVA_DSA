    import java.util.*;
    public class bubbleSort {
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,6,4,5};
        int swap = 0;
        for(int i = 0; i< arr.length-1; i++){
            
            for(int j = 0; j< arr.length-1-i; j++){
                
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0){
                System.out.println("break");
                break;
            }
            
        }

            for(int i = 0; i< arr.length; i++){
                System.out.println(arr[i]);
            }

    }
}
    
