package day20List02;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoops {

    public static void main(String[] args) {

        /*

        For each Loops --->
         Daha kolay
         Daha kolay okunaibliyor
         Daha kolay yazılabiliyor
         Daha koalay mainttnce
         */

        List<Integer> l = new ArrayList<>();
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(15);


        System.out.println(l);//[11, 12, 13, 14, 15]

        for (int i = 0; i<l.size(); i++){
            System.out.print(l.get(i) + " "); //11 12 13 14 15
        }

        System.out.println("---------------------");
        System.out.println();
        //With for-each loop
        for (Integer w : l) {
            System.out.print(w + " "); //11 12 13 14 15
        }


        //l listinde bulunan cift elemanları yazdırınız --> For-Each loop

        System.out.println();
        System.out.println("--------------");

        for (Integer w : l) {
            if (w%2 == 0){
                System.out.print(w + " "); //12 14
            }
        }

        //l listinde bulunan cift elemanları yazdırınız --> For-Each loop ve continue keyword ile yapınız
        System.out.println();
        System.out.println("--------------");

        for(Integer w : l){
            if (w%2 != 0){
                continue;
            }
            System.out.print(w + " "); //12 14
        }




    }
}
