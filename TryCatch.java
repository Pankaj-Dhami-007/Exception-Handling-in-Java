import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        File file = new File("app.txt");
        try {
          Scanner sc = new Scanner(file); // This might throw FileNotFoundException  
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("File Not found");
        }
        
         finally{
            System.out.println("Its here");
         }
    }
}
