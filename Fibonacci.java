import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();           // how many terms
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + (i==n-1 ? "" : " "));
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        sc.close();
    }
}
