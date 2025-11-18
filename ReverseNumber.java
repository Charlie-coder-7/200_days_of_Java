import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            int rev = 0;
            int sign = n < 0 ? -1 : 1;
            n = Math.abs(n);
            while (n > 0) {
                rev = rev * 10 + (n % 10); // append last digit
                n /= 10;
            }
            System.out.println("Reversed = " + (sign * rev));
        }
    }
}
