
public class CountVowels {

    public static void main(String[] args) {

        String name = "aeiou";
        int Counter = 0;
        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
                    || name.charAt(i) == 'u') {
                Counter++;
            }

        }
        System.out.println( "Numbers of Vowels is :  "+ Counter);
    }
}
