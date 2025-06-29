    
    import java.util.*;
    public class L9_SortNegativeAndPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = arr.length-1;
         while (i<j) {
            if(arr[i] < 0) i++;
            if(arr[j]>0) j--;
            if(i>j) break;
            if(arr[i] >0 && arr[j] < 0 ) {
                int temp =  arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            } 
         }
         for(int k = 0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
         }
    }
}
