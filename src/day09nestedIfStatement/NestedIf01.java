package day09nestedIfStatement;

import java.util.Scanner;

public class NestedIf01 {


    public static void main(String[] args) {

        //nested: içe içe girmiş

        /*
        Nested if: iç içe girmiş if statement lar.
         */


        /*
		 Kullanicidan bir sayi alin.

//1.Durum
		 Eger sayi pozitif ise; 10 dan buyuk olup olmadigini kontrol edin --> number>0
		 Eger 10 dan buyuk ise "Buyuksun!" yazdirin --> number>1
		 Eger 10 dan kucuk veya esit ise ise "Normalsin!" yazdirin --> 10 dan büyük değilse --> number<=10

//2. Durum
		 Eger sayi pozitif degil ise; -10 dan buyuk olup olmadigini kontrol edin ---> 1.Durumun Else i
//2.1	 Eger -10 dan buyuk ise "Negatifsin!" yazdirin
//2.2	 Eger -10 dan kucuk veya esit ise "Cok Negatifsin!" yazdirin 2.1 in else duurumudur..
		*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayı giriniz...");
        int number = scan.nextInt();

        if (number>0){

            if (number>10){
                System.out.println("Büyüksün....");
            }else {
                System.out.println("Normalsin...");
            }

        }else if(number == 0) {

            System.out.println("Notrrrr");

         }else{


            if (number>-10){
                System.out.println("Negatifsin...");
            }else {
                System.out.println("Çok Negatifsin...");
            }
        }

    }
}
