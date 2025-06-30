package src.WEEK_1_ARRAY_2;

// Q.In this we have to find the greatest element which is the present after the current index for every index if no greatest element found then update the index with -1 

public class L13_NextGreatestElement {
        
        public static int max(int arr[], int idx, int len) {
            int target = 0;
            for(int i = idx; i< len-1; i++) {
                if(target <  arr[i+1]) {
                    target = arr[i+1];
                }
            }
            return target;
        }
    
        public static void main(String[] args) {
    
            int arr[] = { 3,100,4,9,0,54,22,78,45 };
    
            for(int i = 0 ; i< arr.length; i++) {
                int maximum = max(arr, i, arr.length);
                if( maximum > arr[i]) {
                    arr[i] = maximum;
                }
                else {
                    arr[i] = -1;
                }
            }
            for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
         
        }
    }

