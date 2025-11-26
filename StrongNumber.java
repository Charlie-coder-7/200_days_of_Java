import java.util.Scanner;

public class StrongNumber {
    static int factorial(int x) {
        int f = 1;
        for (int i = 2; i <= x; i++) f *= i;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n, sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            sum += factorial(n % 10);
            n /= 10;
        }
        System.out.println(sum == Math.abs(original) ? "Strong" : "Not Strong");
        sc.close();
    }
}
