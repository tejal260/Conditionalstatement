import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = scanner.nextInt();
        String answer = (num %2 == 0) ? ("Even") : ("Odd");
        System.out.println("The given number is" + " " + answer);

    }

}
