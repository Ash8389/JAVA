import java.util.ArrayList;
import java.util.List;

public class a2_ArrayListUsingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(8);
        nums.add(9);
        nums.add(2);
        nums.add(3);

        System.out.println(nums.indexOf(3));
    }
}