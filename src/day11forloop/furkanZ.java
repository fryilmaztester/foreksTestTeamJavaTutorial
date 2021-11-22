package day11forloop;

import java.util.Scanner;

public class furkanZ {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to find its factors");
        int n = scan.nextInt();

        if(n<0) {
            n = -n;
        }

        int i = 1;

        while(i<=n) {

            if(n%i==0) {
                System.out.print(i + " ");
            }

            i++;
        }

    }


        /*
        System.out.println(leng("furkan"));
        System.out.println(tersten("fatih"));
        uzunlukKadar("ada");


         */


    public static int leng(String text){

        int uzunluk = text.length();
        int halfOfUzunluk = uzunluk/2;
        return halfOfUzunluk;
    }

    public static String tersten(String text){

        String terstenTex = "";
        for (int i = text.length()-1; i>=0; i--){
            terstenTex = terstenTex + text.charAt(i);
        }
        return terstenTex;

    }

    public static String uzunlukKadar(String text){


        for (int i = 0; i<text.length(); i++){
            System.out.print(text);
        }

        return text;
    }
}

