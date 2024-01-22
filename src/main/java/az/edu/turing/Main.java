package az.edu.turing;

public class Main {
    public static void main(String[] args){
//    float a=5;
//    float b=4;
//    //compile time error
//   float c=a/b;
//   double salary= 2_234_345_43.3445;
//        System.out.println(salary);
////        char c1= '\u00022';
////        System.out.println(c1);
//        System.out.println(0.2+0.2+0.2);//neye gore 0.6 ya beraber olmur  0.6 also
//        System.out.printf("%.3f",c);
//        final int age=22;
//        int t=5;
//        int y=4;
//        System.out.println(t++);
//        System.out.println(y--);
//        System.out.println(++y);
//        System.out.println(--t);
//        int l=23;
//        System.out.println(12>>1);
//        System.out.println(12>>2);
//        System.out.println(12>>3);
//        System.out.println(12>>6);
//        System.out.println(14%2==0? "Cut": "Tek");
//        byte o=5;
//        System.out.println(-a);
//        double r=12;
//        System.out.println(Math.PI * Math.pow(r,2));
//        System.out.println(Math.sqrt(16));
        // Math clasina . qoyduqda metodlarina bax
        //tutorial point +-


        System.out.println("25 ve 4 ededlerinin maximumu"+Math.max(25,4));
        System.out.println("25 ededinin kokaltisi=  "+Math.sqrt(25));
        System.out.println("25 ve 4 ededlerinin pi e vurulmasi "+Math.PI*(25+4));
        System.out.println("25 ededi ustlu sekilde  "+Math.pow(25,4));
        System.out.println("-25 ededinin modulu , mutleq qiymeti  "+Math.abs(-25));
        System.out.println("25 arcoosunusu  "+Math.acos(25));
        double b=Math.toRadians(25);
            System.out.println("25 ededini radina cevirdikden sonra arcoosunusu  "+Math.acos(b));
            System.out.println("1 ve -1 arasinda yerlesen ededleri radiana cevirmeden acos tapilir "+Math.acos(-1));
            System.out.println("25 coosunusu"+Math.cos(25));

        System.out.println("25 ededinin tangesi   "+Math.TAU*25);
        System.out.println("25 ededdinin rinti   "+Math.rint(25));
       System.out.println("25 ededinin dekrementi  "+Math.decrementExact(25));
            System.out.println("25 ededinin incrementi  "+Math.incrementExact(25));
            System.out.println("-25 ededinin (aritmetic exception) mutleq qiymeti  "+Math.absExact(-25));
            System.out.println("verilmis ededinin -25,25 arasinda cemi  "+Math.addExact(-25,25));
            System.out.println("verilmis ededlerin ferqi "+Math.subtractExact(-25,25));
            System.out.println("25 ededinin 3 cu dereceden koku "+Math.cbrt(25));
            System.out.println("25.1234 ededinin ceili- ust reqeme yuvarlaqlasdirir  "+Math.ceil(25.1234));
            System.out.println("25 ededinin exp- e^25  , evezine MAth.pow(euler,a) yazila biler   "+Math.exp(25));
            System.out.println("25,23 ededinin flooru (ceil yuxari floor asagi  "+Math.floor(25.23));
            System.out.println("25 ededinin hypot kok x^2+ y^2  "+Math.hypot(25,34));
            System.out.println("25 ededinin log  "+Math.log(25));
            System.out.println("25 ededinin ulp   "+Math.ulp(25.45));

        System.out.println("25 ededinin getecponenti   "+Math.getExponent(25));//what is this
        System.out.println("25 ve 4 e ye hasili   "+Math.E*(25+4));
        System.out.println("random eded   "+Math.random());
//            System.out.println(Math.fma(2567 56));














    }
}