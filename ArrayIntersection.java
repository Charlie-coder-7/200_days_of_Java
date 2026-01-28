import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] a = {1,2,3}, b = {2,3,4};
        Set<Integer> set = new HashSet<>();
        for(int x : a) set.add(x);
        for(int x : b) if(set.contains(x)) System.out.print(x+" ");
    }
}
