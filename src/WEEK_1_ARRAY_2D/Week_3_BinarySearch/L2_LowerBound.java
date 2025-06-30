package src.WEEK_1_ARRAY_2D.Week_3_BinarySearch;
public class L2_LowerBound {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 30, 40, 50, 60, 70 };
        int start = 0;
        int n = arr.length - 1;
        int end = n;
        int target = 25;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                if (arr[mid - 1] == arr[mid]) {

                }
            } else {

            }
        }
        
    }
}
