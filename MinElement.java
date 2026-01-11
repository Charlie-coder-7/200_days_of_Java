public class MinElement {
    public static void main(String[] args) {
        int[] arr = {3,5,1,9,2};
        int min = arr[0];
        for(int x : arr) if(x < min) min = x;
        System.out.println(min);
    }
}
