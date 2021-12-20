package day19List;

import java.util.ArrayList;
import java.util.List;

public class List02 {

    public static void main(String[] args) {


        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Veli");
        list1.add("Angine");
        list1.add("Mary");
        list1.add("Veli");

        System.out.println("List1 :  " + list1);//List1 :  [Ali, Veli, Angine, Mary, Veli]
        list1.add(1,"Melek");
        System.out.println("List1 :  " + list1);//List1 :  [Ali, Melek, Veli, Angine, Mary, Veli]


        System.out.println(list1.size());//6
        //List1 in 3. elamanını yazdırınız
        System.out.println(list1.get(3));//Angine


        //Eğer index ini öğrenmek istediğimiz eleman sayıdı birden fazla ise
        // java bize ilk indexteki elamanın indexini verir.
        System.out.println(list1.indexOf("Veli"));//2

        //Eleman birden fazla olduğu durumlarda En sondaki elemanın index ini bizlere verir.
        System.out.println(list1.lastIndexOf("Veli")); //5

        ///İndex ini öğrenmek istediğim eleman list in içinde yok ise--> -1
        System.out.println(list1.indexOf("xxx")); //-1


        //List in icinden nasıl data kaldırabilriz?
        //remove()
        System.out.println(list1.remove(1));//Melek
        System.out.println(list1);//[Ali, Veli, Angine, Mary, Veli]


        System.out.println("==================================");

        List<String> list2 = new ArrayList<>();
        list2.add("Mary");
        list2.add("Ahmet");
        list2.add("Mary");
        list2.add("Melek");


        System.out.println(list2);//[Mary, Ahmet, Mary, Melek]

        list2.set(1,"Alican");
        System.out.println(list2);//[Mary, Alican, Mary, Melek]

        /*
         * integer list yarat 5 elemanli
         * ve * ekleyerek yazdiriniz.
         *
         */

        List<Integer> list3  =new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);


        List<String> list4 = new ArrayList<>();

        for (int i = 0; i<list3.size(); i++){
            list4.add(list3.get(i) + "*");
        }

        System.out.println(list4);//[1*, 2*, 3*, 4*, 5*]



        List<Integer> list5 = new ArrayList<>();
        System.out.println(list5.isEmpty()); //true

        list5.add(2);
        list5.add(3);

        System.out.println(list5.isEmpty());//false



    }
}
