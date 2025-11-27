import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) { System.out.println("Not perfect"); sc.close(); return; }
        int sum = 1; // 1 is always a proper divisor for n>1
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        System.out.println(sum == n ? "Perfect" : "Not perfect");
        sc.close();
    }
}
