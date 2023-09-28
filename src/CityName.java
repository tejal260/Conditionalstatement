import java.util.Scanner;

public class CityName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter any alphabet from a to f");
        char letter = scanner.next().charAt(0);

        switch (letter)
        {
            case 'a':
                System.out.println( "amersham");
                break;
            case 'b':
                System.out.println(" burnham");
            case 'c':
                System.out.println( "chester");
                break;
            case 'd':
                System.out.println( "durnham");
                break;
            case 'e':
                System.out.println( "exeter");
                break;
            case 'f':
                System.out.println( "falkland");
                break;
            default:
                System.out.println("invalid city name");




        }
    }
}
