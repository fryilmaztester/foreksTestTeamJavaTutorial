package day08IfStatement02;


import java.util.Scanner;

public class IfElse02 {

    // Kullanicidan bir tamsayi alin ve o tamsayinin mutlak degerini
    // ekrana yazdiriniz.

    // a>=0 ==> Mutlak Deger = a
    // a<0 ==> Mutlak Deger = -a --> Değer negatif ise - ile çarpımdır.




    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int number = scan.nextInt();


        if(number>0){
            System.out.println("Mutlak değer: "  + number);
        }else {
            System.out.println("Mutlak değer: " +  (-number));
        }


    }
}
