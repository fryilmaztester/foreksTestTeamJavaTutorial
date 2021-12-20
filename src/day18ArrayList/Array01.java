package day18ArrayList;

import java.util.Arrays;

public class Array01 {

    public static void main(String[] args) {

        //5 elemanlı String bir array oluştularım
        String s[] = new String[5];
        s[0] = "java";
        s[1] = "easy";
        s[2] = "important";
        s[3] = "for";
        s[4] = "it";

        //System.out.println(Arrays.toString(s)); //[s, null, null, null...] --> Eğer ilk eleman harici diğer indexlere eleman ekelemzssek.

        System.out.println(Arrays.toString(s)); //[java, easy, important, for, it]

        //Arrayler de natural order a göre sıralama nasıl yapılır?
        Arrays.sort(s);//sort metodu ile bizler arrayimizi natural order a göre sıralayabiliyoruz.
        //Eğer data type = Str --> alfabetik olarak
        //Eğer data type = Numer --> küçükten büyüğe şekilde
        System.out.println("Sorted: " + Arrays.toString(s));

        System.out.println("=============================================");
        String d[] = {"John", "Adem", "Leo", "Brad", "Adem"};

        //binarySearch() --> Kontrol metodu. Elemanın array in içinde olup olmadığını kontrol etmek için kullanıyoruz.
        //Strlerde ki contain() metoduna benzer.
        //binarySearch() metodunu kullanmadan önce sort() metodunu kullanmak zorudnayız.

        Arrays.sort(d);
        System.out.println(Arrays.binarySearch(d,"Brad"));
        //Aradığımız elemanın arraydeki index number ını bizlere verir.
        System.out.println(Arrays.binarySearch(d,"Leo")); //4

        //Angine ismi array dei diye kontrrol edelim
        System.out.println(Arrays.binarySearch(d,"Angine")); //-3
        //Eğer aradığımız value array in iicnde değil ise aradığımız değeri önce arraye sokara sortlama işlemi yapıyor.
        //Sonrasında ise olması gereken index e 1 ekliyor ve - ile çarpıyor.
        System.out.println(Arrays.binarySearch(d, "Zehra")); //-6


        //Eğer binarySearch(),  birden fazla eleman içeren eleman için kullnılıyorsa her zaman doğru sonucu vermiyor.
        System.out.println(Arrays.binarySearch(d,"Adem"));


    }


}
