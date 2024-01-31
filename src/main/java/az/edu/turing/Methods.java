package az.edu.turing;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        double d=sc.nextDouble();
        int i=sc.nextInt();
        System.out.println(Method(4));
        System.out.println(Method2(5));

    }

            public static double  Method(double d) {
                return d+2;
            }
        public static int Method2(int i){
                return i+2;
        }
}