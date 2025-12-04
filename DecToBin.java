import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String bin = Integer.toBinaryString(n); // built-in
        System.out.println(bin);
        sc.close();
    }
}
