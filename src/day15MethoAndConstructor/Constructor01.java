package day15MethoAndConstructor;


import java.util.Scanner;

public class Constructor01 {

/*

1) Constructor, Classlarda obj create etmek için kullanılır.
2) Javanın default constructor ı vardır. Biz constructor oluşturuduğumuz zaman java default constructor ını siliyor.
3) Constructor --> Cosntructordır. Metod değildir.
4) Constructor ın ismi, class ismi ile aynı olmak zorundadır.
5) Cosntrcutor ın return type olmaz. --> Metodun return type ı olmak zorudnaydı.

6) Cosntructorları parametreli ve ya parameteresiz olarak oluştubaliriz.
 */


   /*
    public Constructor01(){

    }

    */


    public Constructor01() {
        System.out.println("Ben PARAMETRESİZ constructor ım. ");
    }

    public Constructor01(int a){
        System.out.println("Ben, bir PARAMETRELİ INTEGER constructor ım.");
    }

    public Constructor01(int a, int b){
        System.out.println("Ben, iki PARAMETRELİ constructor ım.");
        System.out.println(a+b);

    }

    public Constructor01(double d){
        System.out.println("Ben, bir PARAMETRELİ DOUBLE constructor ım.");
    }



    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

        //ClassName       //objectName         // newKeyword            //Constructor
        Constructor01       obj01         =        new                   Constructor01();




        Constructor01      obj02          =         new                  Constructor01(3);

        Constructor01      obj03          =         new                  Constructor01(3,5);

        Constructor01      obj4           =         new                   Constructor01(3.0);



    }

}
