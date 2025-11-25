import java.util.HashSet;
import java.util.Set;

public class a2_Set
{
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();

        s.add(82);
        s.add(86);
        s.add(66);
        s.add(82);
        s.add(76);

        System.out.println(s);
    }
}