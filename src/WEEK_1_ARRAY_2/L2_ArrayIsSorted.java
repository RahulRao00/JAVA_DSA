package src.WEEK_1_ARRAY_2;
  
  public class L2_ArrayIsSorted {
        
    public static void main(String[] args) {
        
        int arr[]  = {2,0,3,4,5,6,7,8};
        boolean sorted = false; 
        for(int i = 0 ; i < arr.length-1; i++){

            if(arr[i] < arr[i+1]){
                sorted = true;
            }
            else{
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
      }
    }
