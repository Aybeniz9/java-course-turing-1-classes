package az.edu.turing;

import java.util.Scanner;

public class SimpleDivideApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int number = sc.nextInt();
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");


            }

        }


    }
}
