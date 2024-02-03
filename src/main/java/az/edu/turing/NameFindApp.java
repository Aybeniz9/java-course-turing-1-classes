package az.edu.turing;

import java.util.Scanner;

public class NameFindApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String email = sc.nextLine();
        System.out.println(findName(email));
        System.out.println(length(email));
    }

    public static String findName(String email) {

        return email.substring(0,email.indexOf('@'));

    }

    public static int length(String name) {
        return name.length();
    }
}
