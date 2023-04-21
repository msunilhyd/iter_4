package teaching3;

public class Main {

    public static void main(String[] args) {

        int[] a = {1, 3, 4};

        try {
            System.out.println(2/0);
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Closing connection");
        }
    }
}
