package src.WEEK_1_ARRAY_2;
    public class L5_palindromeArray {
        
        public static void main(String[] args) {
            
            int arr[] = {1,2,3,2,0};
            int i = 0; 
            int j = arr.length-1;
            boolean counter = false;
            while ( i<= j) {
                if(arr[i] == arr[j]){
                    counter = true;
                    i++;j--;
                }
                else {
                    counter = false;
                    break;
                }
            }
            System.out.println(counter);
        }
    }
