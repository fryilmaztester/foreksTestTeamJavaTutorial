package day08IfStatement02;

import java.util.Scanner;

public class IfStatement04 {

    	/*
		 Kullanicidan pozitif bir tamsayi alin

		 1.Case
		 Sayi 3 basamakli ise console'a "3 Basamakli" yazdirin
		 2.Case
		 Sayi 2 basamakli ise console'a "2 Basamakli" yazdirin
		 3.Case
		 Sayi 3 basamakli veya 2 basamakli degil ise console'a "Ikisi de degil" yazdirin
		*/


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayı giriniz");

        int number = scan.nextInt();

        //1. Case --> 99 dan büyük  1000 den küçük olması gerekiyor.
        if (number>99 && number<1000){
            System.out.println("Girilen değer üç basamaklı bir sayının değeridir.");
        }

        //2.Case --> 9 ila 100 arasında olması gerekiyor
        if (number>9 && number<100){
            System.out.println("Girilen değer iki basamaklı bir sayının değeridir...");
        }

        //3.Case
        if (!(number>99 && number<1000) && !(number>9 && number<100)){
            System.out.println("Girilen değer her ikiside değildir....");
        }

    }
}
