import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Math.abs(sc.nextLong());
        if (n == 0) { System.out.println(1); sc.close(); return; }
        int count = 0;
        while (n > 0) { n /= 10; count++; }
        System.out.println(count);
        sc.close();
    }
}
