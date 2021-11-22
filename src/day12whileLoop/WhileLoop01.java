package day12whileLoop;

public class WhileLoop01 {

    public static void main(String[] args) {


        //5 ila 11 arasında ki sayıları aralarında birer boşluk bırakarak konsola yazdırınız


        for (int i = 5; i<=11; i++){
            System.out.print(i + " "); //5 6 7 8 9 10 11
        }

        System.out.println();
        System.out.println("-----------With While---------------");

        /*
        While Loop çalışmadan önce condition kontrol eder.
        Eğer bu condition TRUE ise --> bizim kod bloğumuz excute
        FALSE ise not excute
         */

        int i = 5;
        while (i<=11){
            System.out.print(i + " ");
            i++;
        }


    }
}
