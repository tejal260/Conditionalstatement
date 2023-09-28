import java.util.Scanner;

public class NumberValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number");

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The given number is :" + "Positive");}

        else if (number < 0 ) {
                System.out.println( "the given number is negative");
            }
        else {
            System.out.println("the given number is zero");
        }
        }




        }





