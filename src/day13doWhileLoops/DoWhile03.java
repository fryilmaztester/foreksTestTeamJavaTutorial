package day13doWhileLoops;

import java.util.Scanner;

public class DoWhile03 {

        /*
        Kullanıcıdan bir sayı alınız
        Eğer girilen değer 10 dan küçük ise console kazandınız
        10 dan büyükse ve eşitse kullanıcıdan tekrar sayı alınız
         */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int number = 1;

        do {
            System.out.println("Lutfen 10 dan kucuk bir sayı giriniz");
            number = scan.nextInt();

        }while (number>=10);

        System.out.println("Kazandınız...");





    }
}
