package day07IfStatement01;

import org.junit.Test;

import java.util.Scanner;

public class IfStatement03 {

    	/*
		 Kullanicidan bir character alin.

		 1
		 Bu character buyuk harf ise "Buyuk Harf" yazdirin
		 2
		 Bu character kucuk harf ise "Kucuk Harf" yazdirin
		 3
		 Bu character harf degil ise "Harf Degil" yazdirin
		*/

    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.print("karakter giriniz:");
        char c = klavye.nextLine().charAt(0);

        //1.Case
        if (c>= 'A' && c<= 'Z'){
            System.out.println("Girilen Karakter Büyük Harftir....");
        }

        //2.Case
        if (c>= 'a' && c<= 'z'){
            System.out.println("Girilen Karakter Küçük Harftir....");
        }

        //3.Case
        if (!(c>= 'A' && c<= 'Z') && !(c>= 'a' && c<= 'z')){
            System.out.println("Girilen Karakter Bir Harf Değildir...");
        }




        /*
        if(c>='A' && c<='Z' )
            System.out.print("Büyük Harf" + "\n" + c +  "\n" + "Girdiniz!");
        else if (c>='a' && c<='z')
            System.out.print("küçük Haf" + "\n" + c +  "\n" + "Girdiniz!");
        else if (c>='0' && c<='9')
            System.out.print("Sayı" + "\n" + c +  "\n" + "Girdiniz!");
        else
            System.out.print("Özel Karakter" + "\n" + c +  "\n" + "Girdiniz!");

         */



    }
        /*

        Logic Operator (Mantıksal Operatorler):

                1) And Operator - Ve İşlemi:

                And opratorunde return un true olması için karşılaştırıılan şartların
                hepsinin true olması gerekir.

                 Sembol-->  &, &&
                 true && true ===> true
                 true && false ===> false
                 false && true ===> false
                 false && false ===> false


               2) Or Operator -- Ve ya İşlemi:

               Ve ya operatorounde karşılaştırılan şartların herhangi biri true ise
               bana true olarak döner.

               Sembol --> || (Options + büyük-küçük işareti)
               true || true --> true
               true || false --> true
               false || true --> true
               false || false --> false


               ((true || false) && true) //true

               3) Not Operator: Değil İşlemi
               Sembol---> !
               !true = false
               !false = true



         */











}
