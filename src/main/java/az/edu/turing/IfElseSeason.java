package az.edu.turing;

import java.util.Scanner;

public class IfElseSeason {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        double a=sc.nextDouble();
        if(a>=3&&a<=5){
            System.out.println("Spring");
        }
        else if(a>=6&&a<=8){
            System.out.println("Summer");
        }
        else if(a>=8&&a<=11){
            System.out.println("Autumn");
        }
        else if(a>=1&&a<=12){
            System.out.println("Winter");
        }
    }
}
