public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {10,20,5,8};
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for(int x : arr){
            if(x < first){
                second = first;
                first = x;
            } else if(x < second && x != first){
                second = x;
            }
        }
        System.out.println(second);
    }
}
