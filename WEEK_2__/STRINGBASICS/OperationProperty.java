// package WEEK_2__.STRING;

public class OperationProperty {

    public static void main(String[] args) {

        // String Concatenation -> Add two Strings
        String firstName = "Rahul";
        String lastName = "Rao";
        String fullName = firstName + " " + lastName;
        System.out.println("Name is " + fullName);

        // String index
        String name = "Rahul";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));

        // Using for loop String index letters
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }
        String low = new String("rahul");
        System.out.println("\n" + low.toUpperCase());
    }
}
