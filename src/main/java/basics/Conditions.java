package basics;

public class Conditions {

    public static void main(String[] args) {

        int marks = 75;

        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 75) {
            System.out.println("B");
        } else if (marks >= 60) {
            System.out.println("C");
        } else if (marks >= 40) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }
    }
}