package day04Scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {


        //1.Step: Sccaner classından obj. create et
        Scanner scanner = new Scanner(System.in);

        //2.STep: Kullanıcıya message ver
        System.out.println("Lutfen bir karakter giriniz...");

        //3.Step: Kullanıcın girmiş old. değeri al
        char ch = scanner.next().charAt(0); //

        System.out.println("Girmiş olduğunuz char: " + ch);
        scanner.close();


    }
}
