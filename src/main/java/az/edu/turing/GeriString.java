package az.edu.turing;

import java.util.Scanner;

public class GeriString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String reversename = reverseString(name);
    }

    public static String reverseString(String reverse) {
        for (int i = reverse.length() - 1; i >= 0; i--) {

        }
        return reverse;
    }
}
