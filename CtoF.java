import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = (c * 9.0 / 5.0) + 32.0;
        System.out.println(f);
        sc.close();
    }
}
