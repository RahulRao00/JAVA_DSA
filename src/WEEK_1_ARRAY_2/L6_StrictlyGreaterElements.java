package src.WEEK_1_ARRAY_2;
   
   public class L6_StrictlyGreaterElements {
    // In this we have given a target element we have to calculate 
    // how many elements are greater than the target
        public static void main(String[] args) {
            int arr[]  = {2,4,5,6,7,8,23,65,9,11};
            int i = 0;
            int counter = 0;
            while(i< arr.length){
                if(arr[i] > 5){
                    counter++;
                    // i++;
                }
                i++;
            }
            System.out.println( counter );
        }
    }


    