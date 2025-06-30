package src.WEEK_2__String.STRINGBASICS;
public class L4_LargestString 
    public static void main(String[] args) {
 
        String str1 = "aaabcd";
        String str2 = "aaabce";

        int i = 0, j = 0;
        while (i < str1.length()) {

            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            } else if (str1.charAt(i) > str2.charAt(j)) {
                System.out.println("Str1 if greater ");
                break;
            } else {
                System.out.println("Str2 is greater ");
                break;
            }
        }


        System.out.println(str1.compareTo(str2));
        System.out.println("Rahul".compareToIgnoreCase("rahul"));

        String fruits[] = { "apple", "banana", "mango" };
        String largest = fruits[0];
        for (int k = 1; k < fruits.length; k++) {
            if (largest.compareTo(fruits[k]) < 0) {
                largest = fruits[k];
            }
        }
        System.out.println(largest);
    }



    


