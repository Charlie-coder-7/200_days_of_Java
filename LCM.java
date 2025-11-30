import java.util.Scanner;

public class LCM {
    static long gcd(long a, long b) {
        a = Math.abs(a); b = Math.abs(b);
        while (b != 0) { long t = b; b = a % b; a = t; }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long lcm = (a / gcd(a, b)) * b; // divide first to reduce overflow risk
        System.out.println(lcm);
        sc.close();
    }
}
