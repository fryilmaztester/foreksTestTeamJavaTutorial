package day04Scanner;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {


        //1.Step: Scanner classsından ob. creat et
        Scanner scanner = new Scanner(System.in);

        //2.Step: Kullanıcıya message
        System.out.println("Lutfen Isminizi Giriniz");

        //3.Step: Kullanıcının vermiş old. değeri al
        //String name = scanner.nextLine();
        String name = scanner.next();


        /*
        Str olan ifadeleri kullanıcıdan almak için iki farklı metot vardır:
                1. nextLine() --> Kullanıcın bize vermiş old. bütün değerleri alabiliriz.
                2. next() --->    Kullanıcının bize vermiş old. ifadedeki ilk bosluk a kadar alır.
         */

        System.out.println("İsminiz: " + name);

        scanner.close();

    }
}
