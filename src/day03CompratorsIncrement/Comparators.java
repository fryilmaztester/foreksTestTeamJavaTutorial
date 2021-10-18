package day03CompratorsIncrement;

public class Comparators {



    //Comparaotors--> Karşılaşltırma Operatorleri


    //Return Type --> boolean olmalıdır -> Ya True, ya da false döner

    public static void main(String[] args) {

        String str01 = "2";
        int num01 = 2;

        //System.out.println(str01 == num01); --> Data type ı farklı olan iki verinin karışılaştırılması yapılamaz.

        /*
        Java da eşittir demek için "==" kullanırız. Matematikte ise "=" kulalnırız.
        Javda "=" --> assign etme anlamına gelmektedir .
         */


        System.out.println(5<3); //false
        System.out.println(5>3); //true

        String str02 = "str";
        String str03 = "Str";

        System.out.println(str02.equals(str03)); //System.out.println(str02 == str03); //false



        int a = 3;
        int b = 3;

        boolean isEquals = (a==b);
        System.out.println(isEquals);//true


        System.out.println(5 <= 3);//false
        System.out.println(5 >= 3);//true


        // ! --> Olumsuzluk ifadesi katıyor
        System.out.println(5 != 3);//true




    }


}
