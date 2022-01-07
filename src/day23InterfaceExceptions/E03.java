package day23InterfaceExceptions;

public class E03 {

    public static void main(String[] args) {
        printAge(-21);
    }


    public static void printAge(int age){

        if (age < 0){
             throw new IllegalArgumentException("Yaş negativ olamaz");
        }else {
            System.out.println("Yaşınız: " + age);
        }
    }
}
