package az.edu.turing;
import java.util.Scanner;

public class SmpleDivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         final int number=sc.nextInt();
        if (number>=2 &&number<=Math.pow(10,4)){

            for (int i = 1; i <= number/2; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");

                    if(i%2==0){
                    System.out.println("  ededin cut bolenleri  "+(i));}
                    else{
                            System.out.println("Ededin tek bolenleri   "+i);
                        }
                }
        }
    }
}}
