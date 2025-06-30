package src.WEEK_1_ArrayList;
import java.util.ArrayList;
import java.util.List;

public class L5_MultiAL {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(4);
        List<Integer> b = new ArrayList<>();
        b.add(10);
        List<Integer> c = new ArrayList<>();
        c.add(null);

        List<List<Integer>> grid = new ArrayList<>();
        // List<Integer> arr = new ArrayList<>();
        grid.add(a);
        grid.add(b);
        grid.add(c);
        System.out.println(grid);

        for(int i = 0;i < grid.size(); i++) {
            List<Integer> x = grid.get(i);
            for(int j = 0 ; j < x.size(); j++) {
                System.out.print(x.get(j) + " ");
            }
            System.out.println();
        }
    }
}
