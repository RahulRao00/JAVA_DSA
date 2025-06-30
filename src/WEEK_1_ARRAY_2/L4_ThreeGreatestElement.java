package src.WEEK_1_ARRAY_2;
public class L4_ThreeGreatestElement {
    public static void main(String[] args) {
        int arr[] = { 2,4, 57, 8, 9, 11, 23, 54 };

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (max2 < arr[i]) {
                max3 = max2;
                max2 = arr[i];
            }
            else if(max3 < arr[i]){
                max3 = arr[i];
            } 
        }
        
            System.out.println(max1 + " " + max2 + " " + max3);
        
    }
}
