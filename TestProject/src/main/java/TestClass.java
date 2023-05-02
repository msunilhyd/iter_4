public class TestClass {

    public static void main(String[] args) {

        System.out.println("Hello World");
        printHelloWorld();
        printHelloAndMyName("Sunil");

        System.out.println(sumOf2Nums(2, 3));
        System.out.println(prodOf2Nums(2, 4));
    }

    // division
    // remainder
    // subtraction
    public static int prodOf2Nums(int a, int b) {
        return a * b;
    }

    public static int sumOf2Nums(int a, int b) {
        return a + b;
    }

    public static void printHelloAndMyName(String str) {
        System.out.println("Hello " + str);
    }

    public static void printHelloWorld() {
        System.out.println("Hello World 2");
    }
}
