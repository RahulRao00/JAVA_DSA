    public class EvenOddDifference {
        
        public static void main(String[] args) {
            
            int arr[] = {2,3,4,5,6,7,8,9,10};
            int sumEven = 0;
            int sumOdd= 0;
            for(int i = 0; i<arr.length; i++){
                if(arr[i] % 2 == 0){
                    sumEven += arr[i];

                }
                else{
                    sumOdd += arr[i];
                }
            }
            System.out.println(sumEven-sumOdd);
        }
    }
