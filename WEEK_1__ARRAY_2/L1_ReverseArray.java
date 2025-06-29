public class L1_ReverseArray {

    public static void main(String[] args) {

        int arr[] = { 2, 4, 3, 5, 6, 7, 8 };
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        System.out.print(" Array after reverse element : ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
