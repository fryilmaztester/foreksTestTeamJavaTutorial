package day09nestedIfStatement;

import java.util.Scanner;

public class NestedIf03 {

    public static void main(String[] args) {

        /*
		 Kullanıcıdan bir harf girmesini isteyin.

//1.Durum:
         Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. --> Küçük olup olmadıpğına karar vercez.
         Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
         “a” değil ise ekrana “Ilk küçük harf değil” yazdırın. 1.1 durumunun else

//2.Durum:
         Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin.
         Harf “Z” ise ekrana “Son büyük harf” yazdırın.
         “Z” değil ise ekrana “Son büyük harf değil” yazdırın.2.1 durumun else ifades

//3.Durum:
        Harf Girmediniz...

		*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Karakter gir");

        char ch = scanner.next().charAt(0);

        if (ch>= 'a' && ch<= 'z'){ //Harf küçük mü?

            if (ch == 'a'){
                System.out.println("İlk Küçük Harf...");
            }else{
                System.out.println("İlk küçük harf değil");
            }

        }else if(ch>= 'A' && ch<= 'Z'){ //HArf büühyk mü?

            if (ch == 'Z'){
                System.out.println("Son Büyük Harf...");
            }else{
                System.out.println("Son Büyük Harf Değil...");
            }
        }else{
            System.out.println("Harf Girmediniz...");
        }




    }
}
