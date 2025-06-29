public class L9_Rotate_90 {

    public static void main(String[] args) {
        
        int arr[][] = { {1,2,3}, {4,5,6}, {7,8,9}};

        for(int i = 0; i< arr.length; i++) {
            for(int j = 0; j < arr[0].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose of the given matrix 
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j <= i; j++) {
              int temp = arr[i][j];
              arr[i][j] = arr[j][i];
              arr[j][i] = temp;
            }
        }
        System.out.println("After transpose the array : ");
        for(int i = 0; i< arr.length; i++) {
            for(int j = 0; j < arr[0].length;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        // Reverse the array by row wise 
        System.out.println("After 90 degree rotation Matrix is : ");
        for(int i = 0; i< arr.length; i++) {
            for(int j = arr[0].length-1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Change in the same array 
        
        // for(int i = 0; i< arr.length; i++) {
        // int a = 0;int b = arr[0].length-1;
        
        //     while( a < b) {
        //         int temp = arr[i][b];
        //         arr[i][b] = arr[i][a];
        //         arr[i][a] = temp;
        //         b--;a++;
        //     }  
        // }


    }
}