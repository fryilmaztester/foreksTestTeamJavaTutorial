package day016Constructor;

public class Animal {

    int age;
    int weight;
    String name;
    boolean isDanger;


    public Animal(){
        this(false);
        this.age=5;
        System.out.println("Age: " + age);
    }


    public Animal(String name, int weight){
        this();
        this.name = name;
        this.weight = weight;

        System.out.println("2 parametreli const: " + name + " ---- " + weight );
    }

    public Animal(boolean isDanger){

        this.isDanger = isDanger;
        System.out.println("isDanger Const: " + isDanger);
    }



    public static void main(String[] args) {

       // Animal a01 = new Animal();
        Animal a02 = new Animal("Cat", 23);
    }




}
