import java.util.Scanner;

public class TwoSum {
        
     public static void main(String[] args) {
            
            Scanner sc =  new Scanner(System.in);

            System.out.print("Enter the length of the array : ");
            int n =  sc.nextInt();
            int arr[] = new int[n];  // array created with size n

            // input elements from user 
            System.out.print("Enter the elements of the array : ");
            for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the target element  : ");
            int target = sc.nextInt();

            for(int i = 0; i<arr.length;i++){
                for(int j = i+1; j<arr.length; j++){
                    if(arr[i] + arr[j] == target ){
                        System.out.println( target + " is the sum of elements at index  "+i + "," + j);
                    }
                }
            }
    }
}
