package day17ArrayStatic;

public class Static01 {


    int age = 23;
    static int height = 6;


    //Eğer biz static olmayan bir variable ve ya metoda static olan bir metotdan (main) ulaşabilmek icin
    //variable nın bulunduğu class tan object create etmek zorundayız.

    //Eğer varible ve ya metot static olarak tanımlanmış ise metoda ve ya variable direkt class ismi ile
    //ulaşabiliriz. (access)


    public static void main(String[] args) {
        System.out.println(height);
        System.out.println("----------------");
        System.out.println(Static01.height);

        Static01 obj01 = new Static01();
        System.out.println(obj01.age);

    }


    public static void add(int num01, int num02){
        System.out.println(num01 + num02);
    }


    public void substract(int num01, int num02){
        System.out.println(num01-num02);
    }













}
