public class MainClass {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[5]);
            System.out.println(2/0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }  finally{
            System.out.println("Closing connection");
        }
        System.out.println("HElllo World");
    }
}
