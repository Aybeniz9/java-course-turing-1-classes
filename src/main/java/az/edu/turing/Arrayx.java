package az.edu.turing;

import java.util.Scanner;

public class Arrayx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("x");

            }
            System.out.println();


        }


    }
}
