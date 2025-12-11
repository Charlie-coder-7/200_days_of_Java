import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String cleaned = s.replaceAll("\\s+", "").toLowerCase();
        String rev = new StringBuilder(cleaned).reverse().toString();
        System.out.println(cleaned.equals(rev) ? "Palindrome" : "Not palindrome");
        sc.close();
    }
}
