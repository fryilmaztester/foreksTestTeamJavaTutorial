package day016Constructor;

public class Car {

    int year;
    int price;
    String model;
    String color;
    boolean isDiesel;
    double km;

    public Car(int price, int year, String model, boolean isDiesel){

        this.price = price;
        this.year = year;
        this.model = model;
        this.isDiesel = isDiesel;

    }

    public Car(int year, int price, String model, String color, boolean isDiesel, double km) {
        this.year = year;
        this.price = price;
        this.model = model;
        this.color = color;
        this.isDiesel = isDiesel;
        this.km = km;
    }

    public static void main(String[] args) {

        //Constructor ---> obj. create etmek için

        Car obj01 = new Car(12000,2021,"Audi",false);
        System.out.println(obj01.price); //12000
        System.out.println(obj01.year);//2021
        System.out.println(obj01.model);//Audi
        System.out.println(obj01.isDiesel);//false

        System.out.println("=========================================");

        Car obj02 = new Car(2022,25000,"Merco","Black",true,12000);
        System.out.println(obj02.price);//25000
        System.out.println(obj02.year);//2022
        System.out.println(obj02.model);//merco
        System.out.println(obj02.color);//Black
        System.out.println(obj02.isDiesel);//true
        System.out.println(obj02.km);//120000


    }










}
