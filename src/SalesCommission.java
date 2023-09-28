import java.util.Scanner;

public class SalesCommission {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter sales ID");
        int ID = scanner.nextInt();
        System.out.println("please enter seller's name");
        String name= scanner.next();
        System.out.println("please enter sales amount");
        double amount = scanner.nextDouble();
        System.out.println("please enter salary");
        double salary = scanner.nextDouble();

     if (amount>=50000)
         System.out.println("eligible for 35% commission");
     else if(amount >=30000){
         System.out.println( "eligible for 20% commission");}
     else if (amount>=20000) {
         System.out.println("eligible for 10% commission");
     }
     else if (amount>=10000){
         System.out.println( "eligible for 5% commission");}

     else {
         System.out.println( "eligible for 2% commission");

        }

     }





    }









