package az.edu.turing;

import java.util.Scanner;

public class NameFindApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String email = sc.nextLine();
        System.out.println(findName(email));
        System.out.println(length(email));
    }

    public static String findName(String gmail) {

        return gmail.substring(gmail.charAt('@'));

    }

    public static int length(String name) {
        return name.length();
    }
}
