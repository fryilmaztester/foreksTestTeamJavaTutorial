package day23InterfaceExceptions;

public class E02 {


    public static void main(String[] args) {


        /*
        Eğer hata var ise catch bloğu çalışır.
        Hata yok ise try bloğundaki kod yürütülür.

        finally bloğu her iki durumda da çalışır.
         */
        int arr[] = {7,8,9,0};

        try{

            System.out.println(arr[4]);
          //  System.out.println(arr[2]);

        }catch (ArrayIndexOutOfBoundsException e){

            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
          //  e.printStackTrace();

        }finally {
            System.out.println("DONE !!! ");
        }

    }
}
