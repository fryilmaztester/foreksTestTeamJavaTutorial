package day15MethoAndConstructor;

public class MethodCreation02 {


    public static void main(String[] args) {

        add(3,5);//8
        add(3,5,2);//10
        add(3.0,5.0);//8.0
        add(3.0,5.0,2.0);
        add(3.0,5);//8.0
    }


    /*
    1) Bütün her şeyin eşleşmiş olamsına bakıyor...
    2) Java, Auto Wideing yapanbileceği metodu seçiyor.

    --- CTE Compile Time Error ---
     */

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void add(double a, double b){
        System.out.println(a + b);
    }

    public static void add(double a, double b, double c){
        System.out.println(a + b + c);
    }

    /*
    public static void add(double a, int b){
        System.out.println(a + b);
    }

     */




}
