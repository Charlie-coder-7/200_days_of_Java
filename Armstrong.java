import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n, sum = 0;
        int digits = String.valueOf(Math.abs(n)).length();
        n = Math.abs(n);
        while (n > 0) {
            int d = n % 10;
            sum += Math.pow(d, digits); // d^digits
            n /= 10;
        }
        System.out.println(sum == Math.abs(original) ? "Armstrong" : "Not Armstrong");
        sc.close();
    }
}
