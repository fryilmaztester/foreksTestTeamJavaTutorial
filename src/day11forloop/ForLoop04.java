package day11forloop;

import java.util.Scanner;

public class ForLoop04 {

    public static void main(String[] args) {

        /*

		kullanicidan bir String aliniz
		String i tersten yazdiriniz.


        Örn: fatih --> hitaf

		 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz....");

        String word = scanner.nextLine();

        for (int i = word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i)); //
        }




    }
}
