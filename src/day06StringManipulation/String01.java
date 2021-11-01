package day06StringManipulation;

import java.util.Scanner;

public class String01 {


    public static void main(String[] args) {

        String str01 = "Java is Java";
        //substring() -->

        System.out.println(str01.substring(3));//a is Java
        System.out.println(str01.substring(0,6));//Java i

        //is Java yı konsola yazdırınız.
       // System.out.println(str01.substring());
        System.out.println(str01.substring(5));

        System.out.println(str01.length());//12
        System.out.println(str01.substring(12)); //empty --> Boş döner

        //System.out.println(str01.substring(15));// --> Run Time Error fırlatır.

        /*
        Java da iki türlü hata yönetimi vardır.

               1) Compile Time Error (CTE) : Yazılan kodu derlerken karşılaşılan hatalardır.
               Bu hatayı tespit etmek için ekranımız da altı kırmızı ile çizili olması gerekir.
               2) Run Time Error: (RTE): Kodumuz compile olduktan sonra execute esnasında karşılaşılan hatalardır.
         */

       // System.out.println(str01.substring(5,2));//Run Time Error

        //substring() metodu bizden iki farklı değer alır.
        // Birinci değer her zaman, ikinci değerden küçük olmak zorundadır.




        /*
        Kullanıcıdan mail adresini girmesini isteyiniz.
        Kullanıcının domain bilgilerini konsola yazdırınız.

        //foreks.com

        Output:
        Kullanıcın domain bilgisi: foreks.com dur.
         */

        /*

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mail adresinizi giriniz:");

        String userMail = scanner.nextLine();
        System.out.println("Kullanıcının domain bilgisi: " + userMail.substring(userMail.indexOf("@")+1));

         */

        //replace() --->
        String str02 = "Study hard, stay humble";
        System.out.println(str02.replace("h","c"));//Study (h)card, stay (h)cumble
        System.out.println(str02.replace("y",""));//Stud hard, sta humble



        //toLowerCase() --> String ifadedeki büyük olan karakterleri küçültüyor.
        String str03 = "Teach more Learn more";
        System.out.println(str03.toLowerCase());//teach more learn more

        //toUpperCase() ---> Str deki küçük olan karakterleri büyültüyor.
        System.out.println(str03.toUpperCase()); //TEACH MORE LEARN MORE

        //Sadece str03 deki teach i büyülterek str03 ü konsola yazdırınız. output: TEACH more Learn more
        System.out.println(str03.substring(0,5).toUpperCase()  + str03.substring(5)); //TEACH more Learn more

        System.out.println("===========================================");

        //trim() --> trim metodu herhangi bir str ifadenin başndaki ve sonundaki boşluğu alır.
        String str04 = " Java is easy programming language ";
        System.out.println(str04);// Java is easy programming language
        System.out.println(str04.trim());//Java is easy programming language

/*
Ask user ta enter his/her first name, last name and Tc Number.
Then type a program which makes
initials of the first name and the last name in uppercase,
other characters will be in lowercase.
all characters except last 4 characters of the Social Security Number * * * *
   For example; Fatih Yılmaz  ***5678 (11 digit)

		 */







    }


}
