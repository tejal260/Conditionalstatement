import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student name");
        String name = scanner.nextLine();
        System.out.println("Please enter roll number in digit");
        int rollNumber  = scanner.nextInt();
        System.out.println("Please enter maths marks");
        int maths = scanner.nextInt();
        System.out.println("please enter science marks");
        int science = scanner.nextInt();
        System.out.println("please enter english marks");
        int english = scanner.nextInt();
        int total = maths+ english+science;
        System.out.println("total of 3 subjects marks"+ " " + total);
        double percentage = total/3;
        System.out.println("percentage of above student is "+ " " + percentage);
       if (percentage>=35) {
           System.out.println("student is pass");}
       else {
           System.out.println("student is fail");

           }
       if (percentage>= 80){
           System.out.println("above student grade is A+");
       }
       else if (percentage>= 60){
        System.out.println( "above student grade is A");}
       else if (percentage>=50) {
               System.out.println("above student grade is B");}
       else if (percentage>=35){
           System.out.println("above student grade is C");
           }
    }



       }
















