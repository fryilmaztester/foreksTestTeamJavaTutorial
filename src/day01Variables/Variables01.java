package day01Variables;

public class Variables01 {


    public static void main(String[] args) {

/*
            Java da statementlar yani cümleler ";" virgü ile biter.
            Java da kırmız alt çizgili bir ifade görürsek "CTE (Compile Time Error)"

            Eğer biz CTE alıyorsak, hatayı gidermeden kod yazmamalıyız.
            Java da Turkce karakter kullanmayiniz

             */



        /*

        Java da iki farklı data type vardı .


        1) Primitive Data Typlar;
                -boolean: Mantıksal ifadeleri içinde barındırı. Ya True, Ya da False.

         *


         */
        //Data type   VariableName     =    Value
           boolean    isExpensive      =     true;
           boolean    isCheap          =     false;



           System.out.println("Hello World");
           System.out.println(isCheap); //false
           System.out.println(isExpensive);//true


        char ch01 = 'a'; //char data typelarında value '' işaretinin arasına yazılır
        System.out.println(ch01); //a

        char ch02 = ' ';
        System.out.println(ch02);

        byte b01 = 120;
        System.out.println(b01);//120


        short s01 = 1234;
        System.out.println(s01);//1234


        int profitOfForeks = 123123123;
        System.out.println(profitOfForeks);//123123123



        float f01 = 12.3242f;
        float f02 = 123.123F;


        double d01 = 12.345643;
        double d02 = 34.6453;


        System.out.println(d01);//12.345643



        //Non-primitive Data Typelar;
        //String --> Str leri bizler metinsel ifadeleri kullanbilmek için
        // Values --> "" Çift tırnak icerine almalıyız.


        String name = "Fatih";
        System.out.println(name); //Fatih










    }


}
