package src.WEEK_1_ArrayList;
import java.util.ArrayList;
public class L2_StringType_AL {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        name.add("Rahul");
        name.add("Gaurav");
        name.add("Prashant");

        System.out.println(name);
        System.out.println(name.size());

        // Contain element or not
        System.out.println(name.contains("Rahul"));

    }
}
