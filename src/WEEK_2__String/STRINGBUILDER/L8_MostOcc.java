package src.WEEK_2__String.STRINGBUILDER;
import java.util.*;

public class L8_MostOcc {

    // Q. Have to find the most Occurence characters in the String  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int freq[] = new int[26];
        for (char i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = (int) (ch - 97);
            freq[idx]++;
            // freq[str.charAt(i) - 97]++;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == max) {
                char ch = (char) (i + 97);
                System.out.println(ch + ", " + max);
            }
        }
    }
}
