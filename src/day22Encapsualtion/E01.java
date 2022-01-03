package day22Encapsualtion;

public class E01 {

    /*
    Encapsulation: Data hiding.

    -- Bakımı
    -- Kullanıalbiliriği artırır
    -- Daha az coding



    1) access modifier: private olmalı.
    2) getter and setter mettodları create edilir.
           getter --> read, mevcut bulunan data nın value sunu okumak icin kullanırım
           setter --> update,  mevcut bulunan data nın value sunu update icin kullanırım


     */


    private int age = 23;
    private String name = "Ali";

    //getter() olsuturmak
    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }

    //setter olusuturmak
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    /*
    //getter() metodu oluşturmak
    public int getAge(){

        return age;
    }

    public String getName(){

        return name;
    }

    //setter() olusturmak

    public void setAge(){

        this.age = age;
    }

    public void setName(){

        this.name = name;
    }

     */




}
