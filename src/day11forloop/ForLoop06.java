package day11forloop;

public class ForLoop06 {

    public static void main(String[] args) {


        	/*
		 5'den 12'e kadar tum tamsayilarin toplamini hesaplayip ekrana yazdiran programi yaziniz.

		 5+6+7+...12 = ?
		*/

        int sum = 0; //1

        for (int i = 5; i<=12 ; i++){

            sum = sum + i; // 0 = 0 + 5 = 5 --> sum=5
            System.out.println(i + ". stepdeki toplamı: " + sum);
            /*
            5 + 6 = 11
           11 + 7 = 18
           18 + 8 = 26
           26 + 9 = 35
           35 + 10 = 45
           45 + 11 = 56
           56 + 12 = 68
             */
        }

        System.out.println("=======================");
        System.out.println(sum);


    }
}
