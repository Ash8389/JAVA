import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class a1_Iterator {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(6);
        nums.add(4);
        nums.add(1);

        Iterator<Integer> val = nums.iterator();

        while(val.hasNext()){
            System.out.println(val.next());
        }
    }    
}
