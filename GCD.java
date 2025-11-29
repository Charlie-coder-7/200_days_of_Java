import java.util.Scanner;

public class GCD {
    static int gcd(int a, int b) {
        a = Math.abs(a); b = Math.abs(b);
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(gcd(sc.nextInt(), sc.nextInt()));
        sc.close();
    }
}

