package day10ternaryAndSwitchCaseOperations;

import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {
        /*
		 Kullanicidan ay ismini alin ekrana kacinci ay oldugunu yazdirin
		 */


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ay ismi giriniz....");

        /*
        int obje=scan.nextInt();

        switch (obje){
            case 1 :
                System.out.println("Ocak");
                break;
            case 2 :
                System.out.println("Şubat");
                break;
            case 3 :
                System.out.println("Mart");
                break;
            case 4 :
                System.out.println("Nisan");
                break;
            case 5 :
                System.out.println("mayıs");
                break;
            case 6 :
                System.out.println("Haziran");
                break;
            case 7 :
                System.out.println("Temmuz");
                break;
            case 8 :
                System.out.println("Agustos");
                break;
            case 9 :
                System.out.println("Eylül");
                break;
            case 10 :
                System.out.println("Ekim");
                break;
            case 11 :
                System.out.println("Kasım");
                break;
            case 12 :
                System.out.println("Kasım");
                break;
            default:
                System.out.println("1 den 12 ye kadar bir sayı giriniz");
        }

         */

        String month = scan.nextLine().toLowerCase();


        switch (month) {

            case "ocak":
                System.out.println("1. Ay");
                break;
            case "şubat":
                System.out.println("2. Ay");
                break;
            case "mart":
                System.out.println("3. Ay");
                break;
            case "nisan":
                System.out.println("4. Ay");
                break;
            case "mayıs":
                System.out.println("5. Ay");
                break;
            case "haziran":
                System.out.println("6. Ay");
                break;
            case "temmuz":
                System.out.println("7. Ay");
                break;
            case "ağustos":
                System.out.println("8. Ay");
                break;
            case "eylül":
                System.out.println("9. Ay");
                break;
            case "ekim":
                System.out.println("10. Ay");
                break;
            case "kasım":
                System.out.println("11. Ay");
                break;
            case "aralık":
                System.out.println("12. Ay");
                break;

            default:
                System.out.println("Lütfen geçerli bir ay giriniz.");
        }
        scan.close();

    }
}
