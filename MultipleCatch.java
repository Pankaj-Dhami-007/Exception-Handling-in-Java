import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first no : ");
            double a = sc.nextDouble();
            System.out.println("Enter second no : ");
            double b = sc.nextDouble();

            System.out.println("Enter the operation (+, -, *, /) : ");
            char operator = sc.next().charAt(0);
            double result;
            switch (operator) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a + b;

                case '*':
                    result = a + b;

                case '/':
                    if (b == 0) {
                        throw new ArithmeticException("\n \t\tcannot divide by zero");
                    }
                    result = a + b;
                default:
                    throw new IllegalArgumentException("Invalid operator");
            }
            System.out.println(result);
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("Enter valid no : ");
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operator");
        }
        System.out.println("jbcjwdbfkjdbfjdkfbjekfbsdkjfbdfjkvfbjkbvkjbdskjvbealivbh");
    }
}
