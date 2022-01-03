package day22Encapsualtion;

public class Runner {

    public static void main(String[] args) {


        /*
        Animal animal = new Animal();
        animal.hareket();
        animal.icme();
        animal.yeme();

         */

        //Eger pareent class ının constructorı var ise her zaman önce parent ın
        //constructor ı calisir.

        /*
        Cat cat = new Cat();
        cat.miyav();
        cat.icme();

         */

        Dog dog = new Dog();
        dog.havlar();
        dog.yeme("Dogs");

    }
}
