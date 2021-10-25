package day05StringManipulation;

import java.util.Scanner;

public class String01 {

    public static void main(String[] args) {

        //String ler non-primitve data typlarıdır. Value larının yanında
        //bir çok mwethodlar barındırır.

        //String class lar immutable classs



        String s1 = "Java";
        String s2 = "is easy";


        //1. length()
        //s1 değişkeninin uzunnluğınu nasıl bulabiliriz?  --> length()
        System.out.println(s1.length());//4
        System.out.println(s2.length());//7


        //2 charAt(int)
        System.out.println(s1.charAt(0));//J
        System.out.println(s1.charAt(3));//a



        /*
       ...Kullanıcıdan string bir ifade alınız
        Ve ifadenin son hatrfini consola yazdırınız...
         */
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Adınızı Giriniz: ");

        String d1 = scan.nextLine();
        //System.out.println(d1.charAt(6));
        System.out.println("Son Karakter: " + (d1.charAt(d1.length()-1)));

        //Biz herhangi bir string ifadenin son karakterini dymanic olarak bulmak istiyorsak
        //Kullannacağımız metot: d1.length()-1 dır.

 */


        //3. concat() -> Concatanation Birleştirme İşlemidir
        System.out.println(s1.concat(s2)); //Javais easy -->Javais easy
        System.out.println(s1 + s2);

        System.out.println(s2.concat(s1)); //is easyJava --> is easyJava


        //4. contains() --> içerip-içermediğine bakar. Return type == True or False
        //String s2 = "is easy";
        System.out.println(s1.contains("J"));//true
        System.out.println(s1.contains("j"));//false --> Java is sensitveCase -->
        // Java kucuk ve buyuk duyarlıdır.
        System.out.println(s2.contains("ea"));//true
        System.out.println(s2.contains(" "));//true ->
        System.out.println(s2.contains(""));//true


        System.out.println("==============================");

        //5 endsWith()
        System.out.println(s1.endsWith("a"));//true
        System.out.println(s2.endsWith("Y"));//false
        System.out.println(s2.endsWith("y"));//true


        System.out.println("==============================");


        //6 equal() --> Eşit olup olmadığına bakar
        // Return type = boolean yani--> true, false

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase("JAVA"));//true
        System.out.println(s1);//Java



        System.out.println("==============================");


        //7 indexOf() -->
        //String s1 = "Java";
        System.out.println(s1.indexOf("a"));//1
        System.out.println(s1.indexOf("y"));//-1













    }
}

