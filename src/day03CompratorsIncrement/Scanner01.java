package day03CompratorsIncrement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {


        /*
        Kullanıcıdan input almak icin Scanner class ı kullanılır.
         */

        //1.Step Scanner classından object create ediyoruz.
        Scanner scan = new Scanner(System.in);

        //2.Step Kullanıya mesaj ver.
        System.out.println("Lutfen yasinizi Giriniz");


        //3.Step Kullanıcın girdigi datayı saklamak icin data type

        int age = scan.nextInt();

        System.out.println("Kullanıcının Yaşı: " +  age + " dır/dir");

scan.close();




    }
}
