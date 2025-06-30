package src.WEEK_2__String.STRINGBUILDER;
public class L6_reverseWordsInStr {

    public static StringBuilder rev(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse();
    }
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("How are You ");
        StringBuilder ans = new StringBuilder("");

        for(int i = 0; i< sb.length()-1; i++) {
            for(int j = 0; j< sb.length()-1;  j++) {
                if( sb.charAt(j) ==(' ')) {
                    System.out.println("hi");
                    ans.append(rev( " " + sb.substring(i, j)));
                    System.out.println(ans);
                    
                    i = j;
                }
            }
        }
        System.out.println(ans);
    }
}
 

