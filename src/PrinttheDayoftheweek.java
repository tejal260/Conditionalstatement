import java.io.InputStream;
import java.util.Scanner;

public class PrinttheDayoftheweek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     int dayoftheweek = 4;

        switch (dayoftheweek)
        {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");

            default:
                System.out.println("Please enter day 1 to 4");



        }





    }
}