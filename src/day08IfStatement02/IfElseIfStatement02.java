package day08IfStatement02;

import java.util.Scanner;

public class IfElseIfStatement02 {

    /*
		 Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın eğer,
		 Uç kenar uzunluğu birbirine eşit ise ekrana “Eşkenar Uçgen” yazdırın.
		 Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar Uçgen” yazdırın.
		 Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar Uçgen” yazdirin

		 if-elseif ()
		*/

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("üçgenin bir kenar uzunluğunu giriniz");
        int kenar1= scanner.nextInt();
        System.out.println("üçgenin ikinci kenar uzunluğunu giriniz" );
        int kenar2= scanner.nextInt();
        System.out.println("üçgenin üçüncü kenar uzunluğunu giriniz" );
        int kenar3=scanner.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3){
            System.out.println("Eş kenar üçgendir...");

        }else if (kenar1 == kenar2 || kenar2 == kenar3 || kenar1 == kenar3){
            System.out.println("İkiz kenar üçgendir...");

        }else {
            System.out.println("Çeşit kenar üçgendir");
        }
scanner.close();
    }
}
