package day12whileLoop;

import java.util.Scanner;

public class WhileLoop04 {


    /*

     Kullanıcıdan bir sayı alınız (Pozitif Tam Sayı)
     Rakamların Toplamını Yazdırınız.
        Örn--> 	123 ==> 1+2+3 = 6
		*/


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen rakamlarının toplamını öğrenmek istediğiniz sayıyı giriniz");

        int number = scanner.nextInt();


        int sum = 0;

        while (number !=0){

            sum = sum + (number%10); // 123 --> 10 a bölümünden kaln = 3
            number = number/10; //123 bölü 10 = <number==> 12
        }

        System.out.println("sumOfDigit: " + sum);

        scanner.close();




    }
}
