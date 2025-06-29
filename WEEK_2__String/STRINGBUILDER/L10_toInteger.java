import java.util.*;

public class L10_toInteger {

    public static void main(String[] args) {

        String s[] = { "1230", "243", "2032", "2355", "2000" };
        int arr[] = new int[s.length];

        int max = 0;

        for (int i = 0; i < s.length; i++) {
            int n = Integer.parseInt(s[i]);
            max = Math.max(max, n);
        }

        // int max = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }

        System.out.println(max);
    }
}
