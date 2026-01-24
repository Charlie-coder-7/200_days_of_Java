import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1};
        Map<Integer,Integer> map = new HashMap<>();

        for(int x : arr) map.put(x, map.getOrDefault(x,0)+1);
        System.out.println(map);
    }
}
