import java.util.Set;
import java.util.TreeSet;

public class a4_TreeSet {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();//. Sorted

        s.add(56);
        s.add(58);
        s.add(89);
        s.add(56);

        for (Integer n : s) {
            System.out.println(n);
        }
    }
}
