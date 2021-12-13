package day17ArrayStatic;

public class StaticBlock {


    /*
    Static block variable a değer ataması yapmak icin kullanılır--> initialize
    Eger 1 den fazla stacic block var ise önce en üstteki calisir
     */
    static double pi;

    static {
        pi = 3.14;
        System.out.println(pi);
    }


    public static void main(String[] args) {
        area(3);
    }


    public static void area(double r){
        System.out.println("Dairenin Alanı: " + pi * r * r);
    }


}
