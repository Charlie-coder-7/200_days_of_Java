public class SpiralPattern {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][n];
        int value = 1, top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) arr[top][i] = value++;
            top++;
            for (int i = top; i <= bottom; i++) arr[i][right] = value++;
            right--;
            for (int i = right; i >= left; i--) arr[bottom][i] = value++;
            bottom--;
            for (int i = bottom; i >= top; i--) arr[i][left] = value++;
            left++;
        }

        for (int[] row : arr) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}
