
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mayssa
 */


 public class DivisionExecption {


     static  int x =20;
     static int y ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter an integer:");
            y = scanner.nextInt();

            if (y != 0) {
                System.out.println(x / y);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Error: An arithmetic error occurred.");
        } finally {
            scanner.close();
        }
    }


}
