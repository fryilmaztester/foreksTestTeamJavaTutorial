package day12whileLoop;

import java.util.Scanner;

public class WhileLoop05 {

    /*

    Kullanıcıdan tam sayı alınız
    Tam sayının bölenlerini yazdıırnız

       Bölenler==>>  12 ==> 1, 2, 3, 4, 6, 12
                    -12 ==> 1 ,2 3, 4, 6 , 12
		*/

    //% --> modulus operatoe--> Remaidner == 0

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen tam sayı giriniz....");

        int number = scan.nextInt();

        if (number<0){
            number = -number;
        }

        int i = 1;

        while (i<=number) {

            if (number%i==0) {
                System.out.print(i + " ");
            }
            i++;


        }



    }
}
