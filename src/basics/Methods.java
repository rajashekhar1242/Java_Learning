package basics;

public class Methods {

    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        int result1 = add(10, 20);
        int result2 = multiply(5, 6);

        System.out.println(result1);
        System.out.println(result2);
    }
}