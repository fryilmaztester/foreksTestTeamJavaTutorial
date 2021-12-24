package day20List02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List01 {

    public static void main(String[] args) {

        List<String> list1  =new ArrayList<>();
        list1.add("3");
        list1.add("4");
        list1.add("5");
        list1.add("2");
        list1.add("19");

        System.out.println(list1);

        //list i array e nasıl cevirebiliriz.

        String arrayFromList[] =  list1.toArray(new String[0]);
                //list1.toArray(new String[0]); //listi bu sekilde array e cevirebilriiz.

        System.out.println(Arrays.toString(arrayFromList));





    }
}
