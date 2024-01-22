package az.edu.turing;

import java.util.Scanner;

public class FindFesil{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ayı rəqəm ilə daxil edin (1-12): ");
        int ay = scanner.nextInt();


        System.out.println((ay >= 1 && ay <= 12) ? (ay >= 3 && ay <= 5) ? "Payız" :
                (ay >= 6 && ay <= 8) ? "Yay" :
                        (ay >= 9 && ay <= 11) ? "Payız" : "Qış"
                : "Düzgün ay rəqəmi daxil etməmisiniz");


    }
}
