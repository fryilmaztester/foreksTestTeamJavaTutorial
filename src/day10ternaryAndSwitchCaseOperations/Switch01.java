package day10ternaryAndSwitchCaseOperations;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        /*

        switch() --> if- else if gibi çalışır.
        if-else if statementların alternatifidir.

        if-else if e göre kullanımı daha basit, kod okunabilirliği daha kolay ve bakımı da daha kolaydır.
         */

        	/*
		 Kullanici hafta gununun sayisini girsin program haftanin gununu yazsin
		*/

        //1-> p.tesi, 2-> Salı, 3-> Çarş, 4-> perş......


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen öğrenmek istediğininz günün sayısını giriniz ....");

        int day = scan.nextInt();

  /*
        if (day == 1){
            System.out.println("p.tesi"); -->case 1
        }else if (day == 2){
            System.out.println("salı"); --> case 2
        }else if (day == 3){
            System.out.println("Çarşamba");--> case 3
        }

   */


        switch (day) {
            case 1:
                System.out.println("P.tesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("C.tesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lutfen Geçerli Bir gün Sayısı Giriniz....");
        }

        scan.close();

    }
}
