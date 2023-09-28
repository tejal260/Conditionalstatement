import java.util.Scanner;

public class InterchangeValue {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter value for a");
        int a = scanner.nextInt();
        System.out.println("please enter value of b");
        int b= scanner.nextInt();
        int swap = a;
        a=b;
        b= swap;

        System.out.println( "value of a is after interchanging"+ " " + a);
        System.out.println( "value of b is after interchanging"+ " " + b);





    }

}
