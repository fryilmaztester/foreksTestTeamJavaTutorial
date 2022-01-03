package day22Encapsualtion;

public class Animal {


    public Animal() {

        System.out.println("Bu bir hayvan familyasıdır...");
    }


    public void hareket(){
        System.out.println("Hareket Eder....");
    }

    public void yeme(String animalName){
        System.out.println( animalName + " Yemek yer...");
    }

    public void icme(){
        System.out.println("Su icer");
    }




}
