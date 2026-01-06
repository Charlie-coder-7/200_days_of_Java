public class ConcentricSquarePattern {
    public static void main(String[] args) {
        int n = 4;
        int size = 2 * n - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int num = Math.max(Math.abs(i - n), Math.abs(j - n)) + 1;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
