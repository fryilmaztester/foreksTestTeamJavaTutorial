package day23InterfaceExceptions;

public class E01 {


    public static void main(String[] args) {

        /*
        CTE --> Compile Time Error

        RTE --> Run Time Error

         try{

        }catch (){

        } ve ya throw new ExceptionName()

        Eğer hata var ise catch() {} bloğu çalışır. Hata yok ise cartch(){} çalışmaz

         */

        int a = 12;
        int b = 0;

       // int r = a/b;


        try{

            System.out.println(a/b);

        }catch (ArithmeticException e){

            System.out.println("Herhangi bir sayıyı 0 a bölemezsin...");
        }

        /*
        try{

        }catch (Exception e){

        }

         */










    }
}
