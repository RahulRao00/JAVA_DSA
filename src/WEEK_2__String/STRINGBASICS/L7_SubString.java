package src.WEEK_2__String.STRINGBASICS;

public class L7_SubString {

    public static String sunString(String str, int startind, int endind) {
        String sub = "";
        for (int i = startind; i < endind; i++) {
            sub += str.charAt(i);
        }
        return sub;
    }

    public static void allSubStrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        String name = "RahulRao";
        // System.out.println(name.substring(0, 4));

        // String ans = sunString(is, 0, 4);
        // System.out.println(ans);
        allSubStrings(name);
    }
}
    



