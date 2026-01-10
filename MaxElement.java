
public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {3,5,1,9,2};
        int max = arr[0];
        for(int x : arr) if(x > max) max = x;
        System.out.println(max);
    }
}
