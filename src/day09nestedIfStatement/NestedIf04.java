package day09nestedIfStatement;

import java.util.Scanner;

public class NestedIf04 {

    public static void main(String[] args) {

        /*
		 Kullanıcıdan password girmesini isteyin.
//1.Durum
         Girdiği password 5’e bölünüyorsa son rakamını kontrol edin.
         Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın. --> 1.1
         Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın. ---> 1.2 ===> 1.1 duurmunun else li ifadesi

//2.Durum
         Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın. 1. Durumun else i olduğu
		*/


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pwd nizi giriniz...");

        int pwd = scan.nextInt();
       // System.out.println("Girilen pwd: " + pwd);


        if (pwd%5 == 0){

            if (pwd%10 == 0){
                System.out.println("5 e bölünebilen çift sayı");
            }else {
                System.out.println("5 e bölünen tek sayı...");
            }
        }else {
            System.out.println("Tekrar deneyin....");
        }


    }
}
