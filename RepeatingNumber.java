import java.util.*;

public class RepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        Set<Integer> set = new HashSet<>();
        for(int x : arr){
            if(!set.add(x)){
                System.out.println(x);
                break;
            }
        }
    }
}
