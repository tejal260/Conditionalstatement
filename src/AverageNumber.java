import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner=  new Scanner(System.in);

        System.out.println("please enter 5 numbers");
        int  n1,n2,n3,n4,n5;

        n1= scanner.nextInt();
        n2= scanner.nextInt();
        n3= scanner.nextInt();
        n4= scanner.nextInt();
        n5= scanner.nextInt();

        int sum= n1+n2+n3+n4+n5;
        System.out.println("total of 5 numbers" +  " " + sum );

        double average = sum/5.0;
        System.out.println( "average of 5 numbers is " +average);







    }
}
