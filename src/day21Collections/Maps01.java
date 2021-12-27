package day21Collections;

import java.util.HashMap;

public class Maps01 {


    /*
    -- [] --> arrray or list
    -- {} --> Map

    Mapler;
            key and value yapısını kullanır.
            key le unique olmak zorundadır. --> keyle id gibi tek olmalıdır.
            value ler ise birden fazla olabilir.
            key de ve ya value da null kabul eder.


     */

    public static void main(String[] args) {


        //Map i nasıl oluşturabiliriz.
        HashMap<Integer,String> hm1 = new HashMap<>();

        hm1.put(101, "Milk");
        hm1.put(102,"Cheese");
        hm1.put(103,"Meat");
        //hm1.put("Str",12);
        hm1.put(104,"Butter");
        hm1.put(105,"Honey");


        System.out.println("hm1: " + hm1);//hm1: {101=Milk, 102=Cheese, 103=Meat, 104=Butter, 105=Honey}

        System.out.println("----------------");

        hm1.put(101,"Orange");
        //aynı key i kullandığı için java eski value değerinin üzerine yeni value değerini yazar. Overwrite işlemi yapmış olur

        /*

        Ya RTE run time errror
        ya da value değerlerini değiştirebilir.
         */

        System.out.println("hm1 New Keys: " + hm1);//hm1 New Values: {101=Orange, 102=Cheese, 103=Meat, 104=Butter, 105=Honey}

        System.out.println("------------");

        hm1.put(106,"Butter");

        System.out.println("hm1 new value: " + hm1);//hm1 new value: {101=Orange, 102=Cheese, 103=Meat, 104=Butter, 105=Honey, 106=Butter}


        hm1.put(107,null);
        hm1.put(108,null);

        System.out.println("hm1 with null values: " + hm1);//hm1 with null values: {101=Orange, 102=Cheese, 103=Meat, 104=Butter, 105=Honey, 106=Butter, 107=null, 108=null}

        System.out.println("--------");

        hm1.put(null,"Nothings");
        System.out.println("hm1 with null keys: "+ hm1);//hm1 with null keys: {null=Nothings, 101=Orange, 102=Cheese, 103=Meat, 104=Butter, 105=Honey, 106=Butter, 107=null, 108=null}


        System.out.println("101 nolu key değeri: " + hm1.get(101)); //101 nolu key değeri: Orange

        System.out.println(hm1.get(200));//null
        //eger arana key degeri mapte yok ise java bize null döner

        System.out.println("--------");
        System.out.println(hm1.values()); //[Nothings, Orange, Cheese, Meat, Butter, Honey, Butter, null, null]
        //sadece value degerleri

        System.out.println("--------");

        System.out.println(hm1.keySet());//[null, 101, 102, 103, 104, 105, 106, 107, 108]
        //sadece key degerleri


        System.out.println(hm1.getOrDefault(200,"InvalidValues")); //InvalidValues
        System.out.println(hm1.getOrDefault(101,"InvalidValues"));//Orange
        //eğer aranan key degeri map in icinde var ise o key in value sunu bize döner yok ise biizm vermiş olduğumuz
        //default degeri bize döner

        System.out.println(hm1.containsValue("Orange")); //true -- false --> true

        System.out.println("------------");

        System.out.println(hm1.containsKey(200));//false


        System.out.println("------------");

        System.out.println();
        hm1.putIfAbsent(200,"AAA");
        System.out.println(hm1); //{null=Nothings, 101=Orange, 102=Cheese, 103=Meat, 104=Butter, 200=AAA, 105=Honey, 106=Butter, 107=null, 108=null}
        //puIFAbsent() metodu ile bizler göndermiş olduğumuz veriler eğer map in icinde var ise herhangi bir işlem yapılmaz fakat
        //map in icinde göderdiğimziveriler yok ise JAva verileri map e ekler.

        System.out.println("------------");

        hm1.remove(101);
        System.out.println(hm1); //{null=Nothings, 102=Cheese, 103=Meat, 104=Butter, 200=AAA, 105=Honey, 106=Butter, 107=null, 108=null}
        //remove () metodu ile birlikte istedigmiz veriyi map ten kaldırabiliriz.

        System.out.println("------------");

        System.out.println(hm1.replace(103,"Tea"));

        System.out.println(hm1);


        HashMap<Integer,String> hm2  =new HashMap<>();
        hm2.put(301,"SSS");
        hm2.put(302,"DDD");

        hm1.putAll(hm2);//baska bir map in icine baska bir map ekleyebeiliriz.
        System.out.println(hm1);
        //{null=Nothings, 102=Cheese, 103=Tea, 104=Butter, 200=AAA, 105=Honey, 106=Butter, 107=null, 108=null, 301=SSS, 302=DDD}



    }
}
