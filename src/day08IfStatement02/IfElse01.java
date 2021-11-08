package day08IfStatement02;

import java.util.Scanner;

public class IfElse01 {

    /*
    Kullanıcıdan bir sayı alınız
    Sayı:
        Pozitif ise "Girilen Değer Pozitiftir."
        Negatif ise "Girilen Değer Negatifir." yazdırınız

        if - else ile yapınız

        **Notr olma durumunun olmadığını varsayınız...
     */

    public static void main(String[] args) {


        //  If it rains, I will go to mall else I will go to picnic

        //if(Condition){I will go to mall} else{I will go to picnic}


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int number = scan.nextInt();


        if(number>0){
            System.out.println("Pozitif sayıdır");
        }else {
            System.out.println("Negatif sayıdır");
        }

    }


}
