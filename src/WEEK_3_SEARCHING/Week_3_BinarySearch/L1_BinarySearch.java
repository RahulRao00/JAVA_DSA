package src.WEEK_1_ARRAY_2D.Week_3_BinarySearch;

public class L1_BinarySearch {

    public static void main(String[] args) {
        // Array must be sorted in any order

        int arr[] = {10,23,46,89,91,97,107,140,246};
        int target = 46;

        int start = 0;

        int end = arr.length-1;

        while (start < end) {
            int mid  = (start + end) / 2;
            if(arr[mid] == target) {
                System.out.println("Element found at index : " + mid);
                break;
            }
            else if( arr[mid] > target) {
                end = mid-1;
            }
            else {
                start  = mid + 1;
            }
        }
    }
}





