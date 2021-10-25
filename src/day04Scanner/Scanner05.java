package day04Scanner;

import java.util.Scanner;

public class Scanner05 {

      /*
        Kullanıcıdan karakter alarak aşağı da bulunan şekli konsola yazdırınız

        a
       a a
      a a a

         */

    public static void main(String[] args) {

        //1.Step:
        Scanner scanner = new Scanner(System.in);

        //2.Step:
        System.out.println("Lutfen bir karakter giriniz");

        //3.Step:
        char ch = scanner.next().charAt(0);

        System.out.println(" " + " " + ch + " " + " ");
        System.out.println(" " + ch + " " + ch + " ");
        System.out.println(ch + " " + ch + " " + ch);
        scanner.close();


    }

}
