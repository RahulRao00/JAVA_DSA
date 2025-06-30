package src.WEEK_1_ARRAY_2;
import java.util.*;

public class L0_questions {

    static int countDigit(int num) {
        int counter = 0;

        while (num > 0) {
            num = num / 10;
            counter++;
        }

        return counter;
    }

    static int reverseNumber(int num) {
        int rev = 0;
        int rem = 0;

        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            rev = rem + rev * 10;
        }
        return rev;
    }

    static int maxSum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < 8; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        int ans = max + secondMax;
        return ans;

    }

    static void timesOccur(int[] arr) {
        int counter = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                counter++;
            } else {
                System.out.println(arr[i] + "-" + counter);
                counter = 1;
            }
        }
        System.out.println(arr[arr.length-1] + "-" + counter);
        // if (arr[arr.length - 2] != arr[arr.length - 1]) {
        //     System.out.println(arr[arr.length - 1] + "-" + 1);
        // }

    }

    static void oneTimeElements(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println(arr[arr.length-1]);
    }

    static void uniqueElements(int arr[]) {
        boolean flag = false;
          for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            } else if(arr[i+1] != arr[i+2] ){
                flag = true;
                System.out.print(arr[i+1] + ", ");
            }
        }
        if(!flag) {
            System.out.println(-1);
        }
        // System.out.println(arr[arr.length-1]);
    }

    static void largestRepeatingElement(int arr[]) {
        for(int i = arr.length-1; i > 0; i--) {
            if(arr[i] == arr[i-1]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        // int ans = maxSum(arr);
        // System.out.println(ans);
        largestRepeatingElement(arr);
    }
}

