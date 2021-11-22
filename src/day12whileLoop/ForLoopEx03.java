package day12whileLoop;

import java.util.Scanner;

public class ForLoopEx03 {

    public static void main(String[] args) {

        		/*
		 Kullanicidan baslangic ve bitis degerlerini aliniz.
		 Baslangic ve bitis degerleri nasil olursa olsun baslangic degerinden
		 -- başlangıç, bitiş değerinden büyük oaliblir, eşit olabilir ve ya küçük olabilir
		 bitis degerine kadar tum sayilarin carpimini hesaplayan programi yaziniz.
		*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen başlangıç noktası giriniz...");
        int bas = scan.nextInt(); //5 ---> 7
        System.out.println("Lutfen bitiş noktasını giriniz...");
        int bit = scan.nextInt();//7 ---> 4

        int mul = 1;

        if (bas<=bit){

            for (int i=bas; i<=bit; i++){
                mul = mul * i;
            }
        }else {
            for (int i = bas; i>=bit; i--){
                mul = mul *i; //8

            }
        }

        System.out.println("Multiply: " + mul);

scan.close();


    }
}
