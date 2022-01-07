package day23InterfaceExceptions;

public class Runner {

    public static void main(String[] args) {



        /*
        Interfaceler den obje oluşturamayız...

         */

        //DısGorunus d1 = new DısGorunus();

        DısGorunus d2 = new Mercedes();// Referansı interface olan fakant constructor ı Mercedes() class ı olan
        //bir obje oluşturabiliriz. ÇOK ÖENERİLMEZ.

        //Onerilen Yontem...
        Mercedes m1 =  new Mercedes();
        m1.clean();
        m1.headLight();
        m1.color();
        m1.icKaplama();
        m1.tire();


        System.out.println(DısGorunus.PRİCE); //20000
        System.out.println(IcGorunus.PRİCE);//15000




    }


}
