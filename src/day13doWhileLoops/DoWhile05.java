package day13doWhileLoops;

import java.util.Scanner;

public class DoWhile05 {

    public static void main(String[] args) {



    	/*
		 Kullanicidan pozitif bir tamsayi alin
		 Sayi 3 basamakli ise console'a "3 Basamakli" yazdirin

		 Sayi 2 basamakli ise console'a "2 Basamakli" yazdirin

		 Sayi 3 basamakli veya 2 basamakli degil ise console'a "Ikisi de degil" yazdirin

	     Kullanıya mesaj verip--> 	 Sayı negatif ise tekrar sayı alınız
		*/


        Scanner scan = new Scanner(System.in);

//        int number = 0;

/*
        do {
            System.out.println("Lutfen pozitif bir tamsayı giriniz....");
            number = scan.nextInt();

            if (number<0){
                System.out.println("Girdiğiniz değer negatif bir değerdir....");
            }else if (number>99 && number<1000){
                System.out.println("Girilen değer üç basamaklı bir sayının değeridir.");
            }else if (number>9 && number<100){
                System.out.println("Girilen değer iki basamaklı bir sayının değeridir...");
            }else if (!(number>99 && number<1000) && !(number>9 && number<100)){
                System.out.println("Girilen değer her ikiside değildir....");
            }

        }while (number<0);

 */

        boolean flag = false;

        do {

            System.out.println("Lutfen pozitif bir tamsayı giriniz....");
            int number = scan.nextInt();


            if (flag == true){
                flag = false;
            }
            if (number<0){
                flag = true;
                System.out.println("Girdiğiniz Değer negatif bir değerdir...");
            }else if (number>99 && number<1000){
            System.out.println("Girilen değer üç basamaklı bir sayının değeridir.");
             }else if (number>9 && number<100){
            System.out.println("Girilen değer iki basamaklı bir sayının değeridir...");
            }else if (!(number>99 && number<1000) && !(number>9 && number<100)){
            System.out.println("Girilen değer her ikiside değildir....");
        }

        }while (flag);


        /*
        1) Negatif Bir tamsayı
        2) Doğru bir değer girse de sonsuz döngüye ggiriyor... ---> flag değeri 1. stepten sonra her şartta True oalrak kalmaktadır.
        ===> flah true durumnda iken--> false hale getimem lazım

         */






    }
}
