import java.util.Scanner;

public class StudentResult
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println( "enter maths marks");
        int maths = scanner.nextInt();
        System.out.println( "enter english marks");
        int english = scanner.nextInt();
        System.out.println( "enter science marks");
        int science= scanner.nextInt();

        if ((maths >= 35) && (english >= 35) && (science >= 35)){
            System.out.println( "student is pass");}
        else {
            System.out.println("student is fail");
            }

        }

    }

