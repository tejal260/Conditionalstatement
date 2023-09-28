import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter employee ID");
        int ID = scanner.nextInt();
        System.out.println( "please enter employee name");
        String name= scanner.next();
        System.out.println( "please enter basic salary");
        double salary = scanner.nextDouble();

        double HRA = (salary*10)/100;
        System.out.println("HRA: " + HRA);

        double DA = (salary*8)/100;
        System.out.println("DA: " + DA);

        double TA = (salary*9)/100;
        System.out.println("TA: "+ TA);

        double PF = (salary*20)/100;
        System.out.println("PF: "+ PF);

        double gross;
        gross = (salary + HRA + TA + DA + PF);
        System.out.println("Gross Salary: " + gross);





    }

}
