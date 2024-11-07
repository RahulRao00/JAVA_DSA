public class IndexMultiplyAdd {
    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 5, 6, 7, 8 };
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + 10;
            } else {
                arr[i] *= 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
