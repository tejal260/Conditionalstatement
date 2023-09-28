import java.util.Scanner;

public class EligibletoVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your age");
        int age = scanner.nextInt();

        if (age >= 18) {

            System.out.println("person is eligible to vote");
        } else {

            System.out.println("person is not eligible to vote");
        }


    }

}











