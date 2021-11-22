package day12whileLoop;


import java.util.Scanner;

public class WhileLoop03 {

    public static void main(String[] args) {

        /*

      Kullanıcıdan pozitif tam sayı alınız.
      Faktoriyelini yazdırınız
      ! ==> 5*4*3*2*1
      5!=120
		*/


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz....");

        int number = scan.nextInt();
        int result  = 1;

        int i = number; //5

        while (i>=1){
            result = result * i;
            i--;
        }
        System.out.println(number + "! = " + result );
scan.close();

/*
        int i = 1;

        while (i<=number){

            result = result * i;
            i++;

        }
        System.out.println(number + "! = " + result );

 */









    }
}
