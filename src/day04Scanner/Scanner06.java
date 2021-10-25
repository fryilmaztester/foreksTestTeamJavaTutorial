package day04Scanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Scanner06 {


 /*
    Kullanıcıdan dört basamaklı bir sayı alınız.
    Sayını ilk ve son rakamının toplamını yazdırınız.

    Output:
    Son Rakam: 4
    İlk Rakam: 2
    Toplam: 6

     */

    public static void main(String[] args) {

        //1.Step
        Scanner scanner = new Scanner(System.in);

        //2.Step
        System.out.println("Lütfen dört basamaklı bir sayı giriniz...");

        //3.Step
        int num = scanner.nextInt();

      //  System.out.println("Girilen Sayı: " + num);

        int lastNumber = num % 10;

        System.out.println("Son Rakam: " + lastNumber);//4

        int firstNumber = num / 1000;

        System.out.println("İlk Rakam: " + firstNumber); //1

        int sumOfNum = lastNumber + firstNumber;
        System.out.println("Toplam: " + sumOfNum);

scanner.close();



















        /*
        List<String> products = new ArrayList<>();
        products.add("eggs");
        products.add("eggs");
        products.add("milk");
        products.add("cheese");


        List<Float> productsPrice = new ArrayList<>();
        productsPrice.add(2.89f);
        productsPrice.add(2.99f);
        productsPrice.add(5.97f);
        productsPrice.add(3.29f);


        List<String> productSold = new ArrayList<>();
        productSold.add("eggs");
        products.add("milk");
        products.add("cheese");

        List<Float> soldPrice = new ArrayList<>();
        soldPrice.add(2.89f);
        soldPrice.add(3.29f);
        soldPrice.add(5.79f);


        HashMap<String,Float> mapss = new HashMap<>();

        for (int i =0; i<=products.size()-1; i++){
            mapss.put(products.get(i),productsPrice.get(i));
        }



        HashMap<String,Float> mapssTwo = new HashMap<>();
        for (int k =0; k<=productSold.size()-1; k++){
            mapssTwo.put(productSold.get(k),soldPrice.get(k));
        }

        System.out.println(mapss);
        System.out.println(mapssTwo);

         */








    }

}
