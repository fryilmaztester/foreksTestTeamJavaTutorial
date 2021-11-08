package day08IfStatement02;

import java.util.Scanner;

public class IfElseIfStatement01 {


    /*
     Kullanıcıdan bir sayı alın
     Eğer tamsayı 0 dan kucuk ise ekrana “Negatif” yazdırın.
     0 ise ekrana “Nötr” yazdırın.
     0 dan büyük ise ekrana “Pozitif” yazdırın.
    */

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz...");

        //-4
        int number = scanner.nextInt();

        if (number<0){
            System.out.println("Girilen değer negatiftir....");
        }else if (number == 0){
            System.out.println("Girilen Değer Notr....");
        }else {
            System.out.println("Girilen Değer Poziftir...");
        }

    }
}
