import java.util.Scanner;
import java.math.BigInteger;

public class FactorialRec {
    static BigInteger fact(int n) {
        if (n <= 1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(fact(n - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
}
