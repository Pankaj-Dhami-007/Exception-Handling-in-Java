/**
 Basic
 */
public class Basic {
public static void main(String[] args) {
    int a = 0;
    int b = 10;
    String name = "Dhami";
    System.out.println("Before exception occur ");
    try {
        //System.out.println("**********************************");
        int result = b/a;
        System.out.println(result);
        System.out.println("******************************");
    } catch (ArithmeticException e) {
       e.printStackTrace();
        // TODO: handle exception
        //System.out.println("Error : can not devide by Zero");
    }
    System.out.println("After the exception is handled");
    System.out.println(name);
    System.out.println("**********************************************************");
    
}
    
}