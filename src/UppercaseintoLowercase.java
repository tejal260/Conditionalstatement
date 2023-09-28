import java.util.Scanner;

public class UppercaseintoLowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please put any alphabet into Uppercase");
        String letter = scanner.next();
        System.out.println(letter.toLowerCase());
    }
}
