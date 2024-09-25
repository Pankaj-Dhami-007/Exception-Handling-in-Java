import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw {
    static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("\n \t\tCan not devide by zero");
        }

        System.out.println("Hellow");
        return a / b;
    }

    static void divide(int a, int b) {
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("\t\t Error : Not possible to devide by zero");
        }
        System.out.println("\t\tRest of the code");

    }

    public static void main(String[] args) {
        Scanner sc = null;// Initialize to null for proper resource management
        try {
            sc = new Scanner(System.in);
            System.out.println("Enter two integers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
    
            divide(a, b);

            System.out.println("Enter two doubles : ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            System.out.println(divide(x, y));
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("invalid input");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
