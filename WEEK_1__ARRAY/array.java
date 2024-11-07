  
  import java.util.*;
  public class array {
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
            System.out.print("Elements of the array is : ");
            for(int i = 0; i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
            sc.close();
        }
    }
