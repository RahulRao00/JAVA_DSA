package src.WEEK_1_ARRAY_2;

public class L14_NextGreatest2 {
    public static void main(String[] args) {

        int arr[] = { 2, 5, 3, 7, 1, 4, 6 };
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int n = arr.length;

        int ans[] = new int[n];
        ans[n - 1] = -1;
        int nge = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }

        System.out.println("\nUpdated Array after the Next greatest Element : ");
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
