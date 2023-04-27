import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MainClass {

    // Exceptions are 2 types
    // Compile Time
    // Run Time

    public static void main(String[] args) {

        File f = new FileInputStream("C:/users/sunil/test.xt");
        throw new FileNotFoundException();
        System.out.println(f.content());

        int[] a = databse; // http.get // 2
        int[] arr = {1, 2, 4};
        int x = http.get
        try {
            System.out.println(2/x);
            System.out.println(arr[9]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Hello World");
    }
}
