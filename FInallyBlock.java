import java.util.Scanner;

public class FInallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String str = sc.nextLine();
        System.out.println();

        int a = sc.nextInt();
        int b = sc.nextInt();
       try {
        int result = a/b;
        System.out.println(result);
       } catch (ArithmeticException e) {
        // TODO: handle exception
        e.printStackTrace();
       }

        for(int i =0; i< str.length(); i++){
            System.out.print("\t"+str.charAt(i)+"\t");
        }
        sc.close();
    }
}
