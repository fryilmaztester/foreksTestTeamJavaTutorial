package day22Encapsualtion;

public class E02 {


    public static void main(String[] args) {


        E01 e01 = new E01();
        System.out.println(e01.getAge());//23

        System.out.println("-----------");
        System.out.println(e01.getName());//Ali

        System.out.println("---------------");
        e01.setAge(25);
        System.out.println("Uptadated: " + e01.getAge());//Uptadated: 25

        System.out.println("----------------");
        e01.setName("Ayşe");
        System.out.println(e01.getName());




        System.out.println("----E03----------");

        E03 e03 = new E03();

        //Yasını upadete edelim
        e03.setNum(32);
        System.out.println(e03.getNum());

        //Name yazdıralım
        System.out.println(e03.getName());//Fatih


        //Boolean data type ınıntrue ya cevirniz
        e03.setOld(true);
        System.out.println(e03.isOld());//true


    }


}
