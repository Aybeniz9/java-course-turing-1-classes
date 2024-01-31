package az.edu.turing;
import java.util.Locale;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println(word.length());//word length
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(word.charAt(4));
        System.out.println(word.indexOf(2,3));
        System.out.println(word.substring(4,6));
        System.out.println(word.indexOf(9));
        System.out.println(word.equalsIgnoreCase("AYbenizKAizmova"));
        System.out.println(word.concat("Aybanizk"));
        System.out.println(word.startsWith("a"));

    }


    }

