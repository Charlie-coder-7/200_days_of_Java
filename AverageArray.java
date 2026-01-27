public class AverageArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        double sum = 0;
        for(int x : arr) sum += x;
        System.out.println(sum / arr.length);
    }
}
