import java.util.Scanner;

public class Symbol{

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println( "enter first number");
        int number1 = scanner.nextInt();
        System.out.println("enter second number");
        int number2 = scanner.nextInt();
        System.out.println("please enter any symbol ");
        char symbol = scanner.next().charAt(0);

        switch(symbol){
            case '+' :
                System.out.println("addition" +  (number1+number2));
                break;

            case '-':
                System.out.println("substraction" + (number1-number2));
                break;
            case '*':
                System.out.println("multiplication of"+ (number1*number2));
                break;
            case '/':
                System.out.println("division of"+ (number1/number2));

            default:
                System.out.println("invalid symbol entered");







        }



    }
}
