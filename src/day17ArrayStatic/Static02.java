package day17ArrayStatic;

public class Static02 {

    public static void main(String[] args) {

        Static01 obj01 = new Static01();
        System.out.println("Static olmayan age variable: " + obj01.age);//23


        System.out.println("------------------------------------");

        obj01.substract(11,3);

        System.out.println("------------------------------------");

        System.out.println("Static olan height variable: " + Static01.height); //6

        Static01.add(2,3);

        //update static variable
        Static01.height++;
        System.out.println(Static01.height);
    }

}
