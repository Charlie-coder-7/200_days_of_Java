public class SwapTwoNumbers_temp {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int temp = a;      // store a temporarily
        a = b;             // move b into a
        b = temp;          // restore original a into b
        System.out.println("a = " + a + ", b = " + b);
    }
}
