package day02wrapperClass;

public class Operations {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 15;
        double d = 3;

        int res01 = a + b;
        int res02 = c-a;
        int res03 = (int) (a/d); // Java Yuvarlama islemi yapmaz.  3.3333
      //  double res04 = a/d;

        System.out.println(res01); //15
        System.out.println(res02);//5

        System.out.println(res03); //3
   //     System.out.println("Data Type: Double: " + res04); // 3.3333333333333335


        /*
        İslem Onceligi
        1) Parantez Icı İslemler
        2) Carpma ve Bolme İslemleri
        3) Toplama ve Cıkarma İslemleri
         */


        System.out.println(b + a * c); //155
        System.out.println(b + (c - 2 *b)/5); //6

        /*
        Modulus İslemi:
        % --> Modulus İsleminin Sembolu
        İki sayıyı birbirne bolerek kalanı bizlere verir.
         */


        System.out.println(15 % 5); //0
        System.out.println(245 % 3); //2

        System.out.println(10%2); //0 ---> Cift sayı
        System.out.println(5%2); //0 dan farklı oldu icin Tek sayıdır .


        /*
        Concatenation
        Stringler de toplama islemid --> Birlesitme İslşemidir.
         */

        String firstName = "Fatih";
        String lastName = "YILMAZ";

        System.out.println(firstName + lastName); //FatihYILMAZ
        System.out.println(firstName + " " + lastName); //Fatih YILMAZ



        int g = 2;
        int h = 3;

        String i = "Java";
        //g,h ve i harflerini kullanarak 61Java-1 yazdırınız
        System.out.println((g*h) + "" +(h-g) + i +(g-h)); //61Java-1

        int number01 = 10;
        int number02 = 20;
        number01 = number02;
        number02 = 37;
        System.out.println(number01); //?







    }
}
