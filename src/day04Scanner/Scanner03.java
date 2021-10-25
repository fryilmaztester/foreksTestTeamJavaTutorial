package day04Scanner;

import java.util.Scanner;

public class Scanner03 {


     /*

        Kullanıcıdan bir dikdörgenin kenar uzunluklarını alınız
        Diktörgenin alanını hesaplayınız
        Dikdörtgenin çevresini hesaplayınız.

        Output:
        Alan: 12
        Çevre: 14

         */

    public static void main(String[] args) {

        //1.Step: Scanner clasından obj. create et
        Scanner scanner = new Scanner(System.in);
        //2.Step: Kullanıcıya message ver.
        System.out.println("Lütfen dikdötgenin uzzun kenarını girirniz");

        //3.Step: Kullanıcınınm girmiş old. değeri al
        double uzunKenar = scanner.nextDouble();

        System.out.println("Lütfen dikdötgenin kısa kenarını girirniz");

        double kısaKenar = scanner.nextDouble();

        double area = kısaKenar * uzunKenar;
        double cevre = ((2*kısaKenar) + (2*uzunKenar));

        System.out.println("Alan: " + area);
        System.out.println("Çevre: " + cevre);

        scanner.close();












    }

}
