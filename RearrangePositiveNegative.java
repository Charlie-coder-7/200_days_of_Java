public class RearrangePositiveNegative {
    public static void main(String[] args) {
        int[] arr = {-1,2,-3,4,-5,6};
        int[] res = new int[arr.length];
        int k=0;

        for(int x:arr) if(x<0) res[k++]=x;
        for(int x:arr) if(x>=0) res[k++]=x;

        for(int x:res) System.out.print(x+" ");
    }
}