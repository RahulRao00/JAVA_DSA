 import java.util.*;
 public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array 1 : ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        System.out.print("Enter the elements of the array 1 : ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the length of the array 2 : ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        
        System.out.print("Enter the elements of the array 2 : ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int arr3[] = new int[n1 + n2];   // creating array of size arr1 + arr2 in which the elements of both arrays inserted
 
        int i = 0, j = 0 ,k =0;
        // for ( k = 0; k < (n1+n2); k++) {

        //     if (arr1[i] <= arr2[j] && ( i < n1 || j<n2 )) {
        //         arr3[k] = arr1[i];
        //         i++;
        //     }
        //    else if (arr1[i] >= arr2[j] && ( i < n1 || j<n2 )) {
        //         arr3[k] = arr2[j];
        //         j++;
        //     }
        // }
        while (i<n1 && j< n2) {
            if(arr1[i]< arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }
            else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        // Filling of the rest elements in arr2
        if(i == n1){
            while (j< n2) {
                arr3[k] = arr2[j];
                j++;k++;
            } 
        }
      
        //  filling the rest elements of arr1
        if(j == n2) {
            while (i< n1) {
                arr3[k] = arr1[i];
                i++;k++;
            }
        }

        for (int z = 0; z < (n1 +n2 ); z++) {
            System.out.print(arr3[z] + " ");
        }
    }
}
