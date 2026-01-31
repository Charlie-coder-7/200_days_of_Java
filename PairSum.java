import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        Set<Integer> set = new HashSet<>();

        for(int x : arr){
            if(set.contains(target-x)){
                System.out.println("Pair Found");
                return;
            }
            set.add(x);
        }
    }
}
