import java.util.Scanner;

public class PrintVowelorConsonant {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.println("please enter alphabet");
        ch = scanner.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println( "the input alphabet is vowel");}
        else {
                System.out.println("the input alphabet is consonant");
            }

        }
}














