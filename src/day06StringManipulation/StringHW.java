package day06StringManipulation;

import java.util.Scanner;

public class StringHW {

    public static void main(String[] args) {

/*
    Ask user ta enter his/her first name, last name and Tc Number.
    Then type a program which makes
    initials of the first name and the last name in uppercase,
    other characters will be in lowercase.
    all characters except last 4 characters of the Social Security Number * * * *
    For example; Fatih Yılmaz  ***5678 (11 digit)


        Format: *7550
       */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Numaranızı Giriniz");

        String number = scanner.nextLine();

        System.out.println("Girilen number: " + number); //Girilen number: 123456789

        //İstenen Format: *6789

        System.out.println("Formatlanmış Number: " + number.replace(number.substring(0,number.length()-4),"*")); //Formatlanmış Number: *6789








    }
}
