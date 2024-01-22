package az.edu.turing;

import java.util.Scanner;

public class PointApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a >= 91 && a <= 100) {
            System.out.println("A");
        } else if (a >= 81 && a <= 90) {
            System.out.println("B");
        } else if (a >= 71 && a <= 80) {
            System.out.println("C");
        } else if (a >= 61 && a <= 70) {
            System.out.println("D");
        } else if (a >= 51 && a <= 60) {
            System.out.println("E");
        }
        else if (a <=50) {
            System.out.println("F");}
        else System.out.println("GAME OVER");


    }
}
