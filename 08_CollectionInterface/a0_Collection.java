import java.util.ArrayList;
import java.util.Collection;

public class a0_Collection {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(6);
        nums.add(4);
        nums.add(1);

        for(Integer n: nums){
            int num = n;
            System.out.println(num);
        }
    }    
}
