package day07IfStatement01;

import java.util.Scanner;

public class IfStatement02 {

        /*
		 Kulanicidan bir sayi alin bu sayi cift sayi ise console'a "Cift"
		 tek sayi ise console'a "Tek" yazdirtin.
		*/

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int a=scan.nextInt();

        //% --> Modulus operator: Remainder Kalanı veriyor

        if(a%2 == 0){
            System.out.println("Çift sayıdır");
        }else {
            System.out.println("Tek sayıdır");
        }

scan.close();



    }


}
