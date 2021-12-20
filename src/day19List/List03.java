package day19List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List03 {

    public static void main(String[] args) {


        List<Integer> list3  =new ArrayList<>();
        list3.add(3);
        list3.add(4);
        list3.add(5);
        list3.add(2);
        list3.add(19);


        System.out.println("Sıralanmamış: " + list3); //Sıralanmamış: [3, 4, 5, 2, 19]

        Collections.sort(list3);

        System.out.println("Sıralanmış: " + list3);//Sıralanmış: [2, 3, 4, 5, 19]



        //Arrayleri liste nasıl cevirebiliriz.

        String s[] = {"a","b","d","f","r","t"};

        List<String> ls = Arrays.asList(s);
        System.out.println(ls); //[a, b, d, f, r, t]

        ls.set(2,"dX");
        System.out.println(ls); //[a, b, dX, f, r, t]




    }

}
