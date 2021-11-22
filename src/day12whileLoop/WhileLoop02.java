package day12whileLoop;

import java.util.Scanner;

public class WhileLoop02 {

    public static void main(String[] args) {

        /*
		while loop ile;
        Kullanıcıdan bir rakam alınız (0-9)
        Çarpım Tablosunu yazdırınız

3x1 = 3
3x2 = 6
3x3 = 9
3x4 = 12
3x5 = 15
3x6 = 18
3x7 = 21
3x8 = 24
3x9 = 27
3x10 = 30
	*/


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz....");

        int number = scan.nextInt();

        int i = 1;

        while (i<11){
            System.out.println(i + ". step: " + number + "x" + i + "=" + number*i);
            i++;
        }




    }
}
