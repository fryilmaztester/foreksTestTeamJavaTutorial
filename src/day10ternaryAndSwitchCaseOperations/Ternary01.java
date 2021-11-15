package day10ternaryAndSwitchCaseOperations;

import java.awt.font.ShapeGraphicAttribute;
import java.util.Scanner;

public class Ternary01 {

    /*
    Kullanıcıdan bir sayı alınız
    Eğer girilen sayı rakam ise "Girdiğiniz sayı rakam değildir". number > 9
    Eğer girilen sayı rakam ise "Giridğiniz sayı rakamdır" number <= 9 1. durumun else li ifadesi
     */


    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz....");

        int number = scan.nextInt();

        String result = number>9 ? "Girdiğiniz sayı rakam değildir" : "Girdiğiniz sayı rakamdır";
        System.out.println(result);
    }



}
