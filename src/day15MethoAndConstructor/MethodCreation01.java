package day15MethoAndConstructor;

public class MethodCreation01 {

    public static void main(String[] args) {


        /*

        int num = 0;
        int num = 2;

         */

        add(3.0,4.2);
        add(3,4.2,2.8);
        dividing(21,3);
        mul(3,5);
        System.out.println(concatOperator("Fatih","Yılmaz"));
        System.out.println(dividingWithReturn(21,3));

    }



    /*
    Method Overloading
    Bir metod ismi birden fazla kez kullılabilir.
        1)Parametrelerinin sayısını değiştirebiliriz
        2)Parametrelierin data type ını değiştirebiliriz.
        3)Data sırasını değiştirebiliriz.

     */


    public static void add(double a, double b){
        System.out.println(a+b);
    }

    public static void add(double a, double b, double c){
        System.out.println(a+b+c);
    }

    //Bolme islemi yapacak bir metod creat ediniz
    public static void dividing(int a, double b){
        System.out.println(a/b);
    }

    //Carpma islemi yapacak bir emtot olusturnuz
    public static void mul(int a, int b ){
        System.out.println(a*b);
    }


    //concatOperator("Fatih", "Yılmaz")

    public static String concatOperator(String name, String lastName){

        String con = name + " " + lastName;
        return con;
    }

    public static double dividingWithReturn(double num, double number){

        //return keyword u kullanıldığı metodda en alt satırda olur.
        // return un altına herhangi başka bir şey yazılmaz.
        return (num/number);
        //System.out.println("rer");
    }

}
