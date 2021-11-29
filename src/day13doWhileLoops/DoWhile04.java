package day13doWhileLoops;

public class DoWhile04 {


    /*
     * "1234_?!abcdef", rakamlari ve harfleri sayiniz
     *
     * Örn:
     * Rakam = 4
     * Özel Char = 3
     * Alphateic Char = 6
     *
     */


    public static void main(String[] args) {

       // String str = "1234_?!abcdef";

       // System.out.println(str.charAt(1)); //12

        //do-while --> index

        /*
        int sum = 0;
        int mul = 1;

         */



        //While --> k<str.lenght()


        String str = "1234_?!abcdef";


        int letterChar = 0;
        int numericChar = 0;
        int specialChar = 0;

        int k = 0;

        do {

            boolean isLetter = (str.charAt(k)>='a' && str.charAt(k)<='z') ||
                    (str.charAt(k)>='A' && str.charAt(k)<='Z'); //Bu şartlardan her hangi biri True dönerse isLetter True oalcaktır.

            boolean isNumeric = str.charAt(k)>='0' && str.charAt(k)<='9'; //

            boolean isSpecialChar = !isLetter && !isNumeric;

            if (isLetter){
                letterChar++;
            }

            if (isNumeric){
                numericChar++;
            }

            if (isSpecialChar){
                specialChar++;
            }

            k++;

        }while (k<str.length());

        System.out.println("Alphatic Char : " + letterChar);
        System.out.println("Numeric Char: " + numericChar);
        System.out.println("Special Char: " + specialChar);

    }
}
