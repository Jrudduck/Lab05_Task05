import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numberOne;
        double numberTwo;
        System.out.println("Enter a number.");
        if(scan.hasNextDouble()){
            numberOne = scan.nextDouble();
            System.out.println("Enter another number.");
            if(scan.hasNextDouble()){
                numberTwo = scan.nextDouble();
                if (numberOne == numberTwo){
                    System.out.println( numberOne + " is equal to " + numberTwo + ".");
                }
                if (numberOne > numberTwo){
                    System.out.println( numberOne + " is greater than " + numberTwo + ".");
                }
                if(numberOne < numberTwo){
                    System.out.println( numberOne + " is less than " + numberTwo + ".");
                }
            } else {
                System.out.println("Invalid Data Type");
                System.exit(0);
            }




        } else {
            System.out.println("Invalid Data Type");
            System.exit(0);
        }

    }
}