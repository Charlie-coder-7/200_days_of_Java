import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (!Character.isLetter(ch)) {
            System.out.println("Not a letter");
        } else if ("aeiou".indexOf(ch) >= 0) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
        sc.close();
    }
}
