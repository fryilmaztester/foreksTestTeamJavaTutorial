package day14MethodCreation;

public class MethodCreation01 {


    public static void main(String[] args) {

        //Entry Point--> Giriş Noktası

      /*
        int a = 5;
        int b = 3;
        int c = a + b;


       */

        toplama();
        toplamaWithParametrizing(12.3,10.7); //Toplama İşleminin Sonucu: 23.0

    }

    /*
    Her metot tek bir iş yapmalıdır.
    Her metot yaptığı iş ile adlandırılmaldır.

     */

    /*
    metot(){

    }
         */


    public static void toplama(){

        System.out.println("Ben Toplama işlemi Yapmak için oluşturuldum...");
    }


    public static void toplamaWithParametrizing(double a,double b){

        System.out.println("Toplama İşleminin Sonucu: " + (a + b));
    }





}
