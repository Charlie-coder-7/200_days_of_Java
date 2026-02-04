import java.util.*;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 9;

        for(int i=0;i<arr.length-2;i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                if(set.contains(target - arr[i] - arr[j])){
                    System.out.println("Triplet Found");
                    return;
                }
                set.add(arr[j]);
            }
        }
    }
}
