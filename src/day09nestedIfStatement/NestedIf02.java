package day09nestedIfStatement;

import java.util.Scanner;

public class NestedIf02 {

    public static void main(String[] args) {

        /*
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		  erkek-> Erkek-> ERKEK-> erKEk
            ---> equalsIgnoreCase() ==> Harflerin buyukluğu ve ya kucukluğu çok önemli. Ignore ediyor.

		  ***Cinsiyetin harflerinin küçüklüğü ve ya büyüklüğü biizler için önemli olmasın.
		  case kuralını ignore edelim.

//1.Durum:
         Erkek ise yaşını kontrol edin.
         Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
         Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın. 1.1 durumunun else ifadesi
//2.Durum:
         Kadin ise yasini kontrol edin.
         Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
         Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın. 2.1 durumunun else ifadesi
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyetinizi Giriniz... Erkek/Kadın");
        String cinsiyet = scan.nextLine();

        System.out.println("Yaşınızı giriniz");
        int age = scan.nextInt();


        if (cinsiyet.equalsIgnoreCase("Erkek")){

            if (age<18){
                System.out.println("Erkek Çocuk....");
            }else {
                System.out.println("Adam....");
            }
        }else if (cinsiyet.equalsIgnoreCase("Kadın")){

            if (age<18){
                System.out.println("Kız Çocuk....");
            }else {
                System.out.println("Kadın...");
            }
            
        }else{
            System.out.println("Böyle bir cinsiyet tanımlı değil...");
        }

scan.close();


    }
}
