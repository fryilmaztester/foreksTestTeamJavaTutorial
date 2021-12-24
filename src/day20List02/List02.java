package day20List02;

import java.util.ArrayList;
import java.util.List;

public class List02 {


    /*
     * Create an integer array, with 5 elements
     * Convert it to alist
     *
     *
     * add 2 more elements into the list (11,13), 11 at the beginning, 13 will be at index 3
     *
     * Increaes by 3 --> 3 ile topla ve update et
     *
     * print multiplication of the elements from index 2 to index 5 --> Carpımları
     */

    public static void main(String[] args) {


        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;


        List<Integer> listFromArr = new ArrayList<>();

        for (int i = 0; i<arr.length; i++){
            listFromArr.add(arr[i]);
        }
        System.out.println("List: " + listFromArr);//List: [1, 2, 3, 4, 5]

        listFromArr.add(0,11);
        listFromArr.add(3, 13);

        System.out.println("Ekelnmis: " + listFromArr); //Ekelnmis: [11, 1, 2, 13, 3, 4, 5]

        for (int k = 0; k<listFromArr.size(); k++){
            listFromArr.set(k,listFromArr.get(k) + 3);
        }

        System.out.println("Update: " + listFromArr);//Update: [14, 4, 5, 16, 6, 7, 8]


        //2-5
        int multiply = 1;
        for (int j = 2; j<=5; j++){
            multiply = multiply * listFromArr.get(j);
        }

        System.out.println("Carpilmis: " + multiply); //Carpilmis: 3360


    }









}
