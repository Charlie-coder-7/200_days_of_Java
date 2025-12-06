import java.util.Scanner;

public class LeapYear {
    public static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isLeap(sc.nextInt()) ? "Leap year" : "Not leap year");
        sc.close();
    }
}
