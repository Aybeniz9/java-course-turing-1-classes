package az.edu.turing;

import java.util.Scanner;

public class PointApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a >= 91 && a <= 100) {
            System.out.println("A");
        } else if (a >= 81 && a <= 90) {
            System.out.println("A");
        } else if (a >= 71 && a <= 80) {
            System.out.println("A");
        } else if (a >= 61 && a <= 70) {
            System.out.println("A");
        } else if (a >= 51 && a <= 60) {
            System.out.println("A");
        } else System.out.println("kesilmissen");


    }
}
