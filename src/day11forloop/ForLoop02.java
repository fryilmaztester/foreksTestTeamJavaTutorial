package day11forloop;

import java.util.Scanner;

public class ForLoop02 {

    public static void main(String[] args) {

        /*
		 Kullanıcıdan başlangıç ve bitiş değerlerini alın
		 Başlangıç değerinden başlayıp bitiş değerinde biten tüm tamsayıları ekrana yazdırın.
		 Ornek: Kullanici 10 ve 15 verirse ==> 10 11 12 13 14 15 --> Başlangıç değeri, bitiş değerinden küçük olmalı
		*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen başlangıç ve bitiş değerlerini giriniz");

        int begining = scan.nextInt();
        int ending = scan.nextInt();



        if (begining>ending){
            System.out.println("Başlangıç değeri, bitiş değerinden küçük olmalıdır...");
        }else {

            for (int i = begining ; i<=ending ; i++){
                System.out.print(i + " ");
            }
        }


    }
}
