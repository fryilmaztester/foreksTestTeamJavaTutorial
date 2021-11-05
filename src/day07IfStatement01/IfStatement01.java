package day07IfStatement01;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        /*

        If it rains, I will go to mall else I will go to picnic

        SOLID -->
         */

   /*
        boolean itRains = false;

        if (itRains){
            System.out.println("I will go to mall");
        } else {
            System.out.println("I will go to picnic");
        }

    */


        /*
        Kullanıcıdan iki farklı sayı alınız
        Sayıların birbirine göre durumlarını inceleyiniz. --> a,b
        a<b --> A,B den küçüktür.
        a>b --> A, B den büyüktür.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki farklı sayı giriniz...");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a<b){
            System.out.println("A, B den küçüktür....");
        }else{
            System.out.println("A,B den büyüktür.....");
        }










    }
}
