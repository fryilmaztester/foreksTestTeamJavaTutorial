package day04Scanner;

import java.util.Scanner;

public class Scanner04 {

    //Kenar uzunlukları kullanıcıdan alınan bir ücgenin cevresini hesaplayınız.
    //Data type byte olacaktır.
    //Output:
    //Ucgenin Cevresi: 12

    public static void main(String[] args) {


        Scanner scanner57 = new Scanner(System.in);

        System.out.println("Üçgenin 1. Açılarını Giriniz: ");

        byte k01 = scanner57.nextByte();
        System.out.println("Üçgenin 2. Açılarını Giriniz: ");
        byte k02 = scanner57.nextByte();
        System.out.println("Üçgenin 3. Açılarını Giriniz: ");
        byte k03 = scanner57.nextByte();

        int cevre =  (k01+k02+k03);

        System.out.println("Üçgenin Çevresi: " + cevre);


    }
}
