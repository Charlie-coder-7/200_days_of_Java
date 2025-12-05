import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();
        int dec = Integer.parseInt(bin, 2); // parse base-2
        System.out.println(dec);
        sc.close();
    }
}
