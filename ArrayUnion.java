import java.util.*;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] a = {1,2}, b = {2,3};
        Set<Integer> set = new HashSet<>();
        for(int x : a) set.add(x);
        for(int x : b) set.add(x);
        System.out.println(set);
    }
}
