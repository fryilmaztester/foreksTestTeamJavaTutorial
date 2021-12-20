package day19List;


import java.util.ArrayList;
import java.util.List;

public class List01 {

    public static void main(String[] args) {

        /*

        Listler de arrayler de olduğu herhangi bir uzunluk belirtmemize gerek yoktur.
        Listlerin uzunlujları ile işlem yaapabiliriz.
        Arraylere göre daha esnek davranırlar
        Listlerin icerisinde Wrappclasslar ve Non-Primitive Data Typelerını tutabilieriz.
         --> Primitive data typlarını tutamıyoruz.

         */


        // List oluşturma

        //1.Yol
        ArrayList<Integer> list1 = new ArrayList<>();

        //2.Yol
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        //3.Yol--> En cok kullanılan yontem budur.
        //List<> i esitligin sag tarafında kullanmayınız. Kullanılmaz.
        List<Integer> list3 = new ArrayList<>();


        //List e nasıl eleman ekleyebiliriz.
        list3.add(11);
        list3.add(13);
        list3.add(9);

        System.out.println("List3: " + list3); //List3: [11, 13, 9]

        //istenilen index e elamanı nasıl ekleyebilriim
        list3.add(1, 10);
        list3.add(0,21); //List3 1. İndex e elaman ekledik: [21, 11, 10, 13, 9]

        System.out.println("List3 1. İndex e elaman ekledik: " + list3); //List3 1. İndex e elaman ekledik: [11, 10, 13, 9]

        System.out.println("---------------------");

        //Bir listin uzunluğunu nasıl bulabiliriz?
        //size() metodunu kullanıuyoruz.
        System.out.println("List3 ün uzunluğu: " + list3.size()); //List3 ün uzunluğu: 4


        //Specific indexte ki elamanı nasıl alırım?
        System.out.println("List3 ün 1. indexteki elamanı: " + list3.get(1)); //List3 ün 1. indexteki elamanı: 10


        System.out.println(list3.subList(1, 3));//[10,13]
        System.out.println("List3 ün son elamanı: " + list3.get(list3.size() - 1));//List3 ün son elamanı: 9


        //İcerip icermediğine nasıl bakbilriz
        System.out.println(list3.contains(77));//false

    }


}

