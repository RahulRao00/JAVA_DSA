import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.print("Sum of the Element  of the array is : " + sum);
        sc.close();
    }
    

}
