package az.edu.turing;

import java.util.Scanner;

//Scanner.app
public class Lesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte b1 = 4;
        byte b3 = (byte) 129;//downcasting
        System.out.println(b1);
        System.out.println(b3);

        int i1 = b1; // int i1=(byte)b1 //upcasting.
        System.out.println(i1);//casting olur

        int i2 = 5;
        byte b2 = (byte) i2;
        System.out.println(b2);

        int i4 = 130;
        byte b4 = (byte) i4;//downcasting -126
        System.out.println(b4);


        //  boolean isValidInput=n<1 || n>12;
        //  System.out.println();//verilen ededin hansi fesil oldugu.
//        System.out.println(number==6  && number==3 ?"Summer":"Winter");
//        System.out.println(number==9  || number==12 ?"Autmn":"Spring");
//        System.out.println();
    }
}
