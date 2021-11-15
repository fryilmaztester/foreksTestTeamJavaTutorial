package day10ternaryAndSwitchCaseOperations;

import java.util.Scanner;

public class NestedTernary {

    /*
		 Kullanıcıdan bir tamsayı girmesini isteyin.

//1.Durum
		  tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.

//2.Durum
         3 basamaklı degilse çift olup olmadigini kontrol edin.
         Çift ise “3 basamaklı olmayan çift sayı” yazdırın. --->>> 2.1
         Çift sayı degilse “3 basamaklı olmayan tek sayı” yazdirin ---->>> 2.2

		*/


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayı giriniz....");

        int num = scan.nextInt();


        String result = num>99 && num<1000 ? "3 Basamaklı...." : num%2==0 ? "3 Basamaklı olmayan çift sayı" : "3 Basamaklı olmayan tek sayı";
        System.out.println(result);
    }
}
