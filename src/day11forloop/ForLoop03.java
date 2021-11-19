package day11forloop;

import java.util.Scanner;

public class ForLoop03 {

    public static void main(String[] args) {

        	/*
		 Kullanıcıdan başlangıç ve bitiş değerlerini alın
		 Başlangıç değerinden başlayıp bitiş değerinde biten tüm çift tamsayıları ekrana yazdırın.

		 i%2==0 --> Çift Sayı Anlamına Gelemktedir.

		*/





        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen başlangıç ve bitiş değerlerini giriniz");

        int begining = scan.nextInt();
        int ending = scan.nextInt();


        if (begining>ending){
            System.out.println("Başlangıç değeri, bitiş değerinden küçük olmalıdır...");
        }else {
            for (int i = begining ; i<= ending; i++){
                if (i%2 == 0){
                    System.out.print(i  + " ");
                }
            }
        }

    }
}
