package basics;

public class Operators {

    public static void main(String[] args) {

        int a = 20;
        int b = 7;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        System.out.println(a>b);
        System.out.println(a==b);

        boolean result = a>10 && b<10;

        System.out.println(result);
    }
}