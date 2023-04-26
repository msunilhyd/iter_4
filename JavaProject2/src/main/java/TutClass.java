public class TutClass {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4};

        try {
            System.out.println(2/0);
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Hello WOrld");
    }
}
