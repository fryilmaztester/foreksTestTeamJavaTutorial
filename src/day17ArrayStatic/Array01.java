package day17ArrayStatic;

import java.util.Arrays;

public class Array01 {


    public static void main(String[] args) {

        //Array Olusturma
        int arr [] = new int[3];

        //Array e nasıl eleman eklenir?
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 1;

        //Nasıl yazdırırım?
        System.out.println(Arrays.toString(arr)); //[3, 2, 1]  --> Array, List
        //{ } --> Map

        //Specific veriyi nasıl yazdırırım?
        System.out.println(arr[1]);//2


        String strArr [] = {"fatih", "fr"};
        System.out.println(Arrays.toString(strArr));//[fatih, fr]

        String str [] = new String[2];
        str[0]  ="Fatih";
        System.out.println(Arrays.toString(str));//[Fatih, null]





    }

}
