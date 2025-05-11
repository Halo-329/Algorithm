import java.util.*;

public class test {
    public static void main(String args[]) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1, 2, 3, 4));
        list.add(Arrays.asList(1, 2, 3));


        System.out.println(list.get(1).get(2));
    }
}
