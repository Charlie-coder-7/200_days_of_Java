import java.util.Scanner;

public class MinOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int min = Math.min(a, Math.min(b, c));
        System.out.println(min);
        sc.close();
    }
}
