package basics;

public class Loops {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("For Loops: "+i);
        }
        System.out.println();

        int i = 1;

        while (i <= 5) {
            System.out.println("While: " + i);
            i++;
        }
    }
}