package az.edu.turing;

import java.util.Scanner;

public class OfCourse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for (int i = 0; i <n; i++) {
          int a=sc.nextInt();
          arr[i]=a;

        }
        for (int i = 0; i <arr.length ; i++) {

            System.out.print(2*arr[i]);

        }
    }
}
