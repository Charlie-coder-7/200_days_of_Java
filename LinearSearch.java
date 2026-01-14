public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8};
        int key = 6;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not found");
    }
}
