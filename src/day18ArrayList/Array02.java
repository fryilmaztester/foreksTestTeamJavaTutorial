package day18ArrayList;

import java.util.Arrays;

public class Array02 {

    public static void main(String[] args) {

        int a[] = {1,2,3};
        int b[] = {3,2,1};


        //Eşit olup, olmama durumu
        //equals() --> eşit olup olmadığını kontrol etmek için kullandığımız metot

        System.out.println(Arrays.equals(a,b)); //false

        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a,b)); //true


        String s = "I like java but Java needs to study hard to learn so study hard";

        String word[] = s.split(" ");
        System.out.println(Arrays.toString(word)); //[I, like, java, but, Java, needs, to, study, hard, to, learn, so, study, hard]
        //split() metodu ile birlikte bizler strign i parçalayabiliriyoruz.
        //eğer çift boşluk varsa bir tanesini stringten atıyor.


        String word2[] = s.split("t");
        System.out.println("length: " + word2.length);//length: 6
        System.out.println(Arrays.toString(word2)); //[I like java bu, Java needs ,o s, udy hard , ...] --> [I like java bu,  Java needs , o s, udy hard , o learn so s, udy hard]


        //s Stringindeki karakter sayısını hesaplayınız.
        String word3[] = s.split("");
        System.out.println(Arrays.toString(word3));//[I,  , l, i, k, e,  , j, a, v, a,  , b, u, t,  , J, a, v, a,  , n, e, e, d, s,  , t, o,  , s, t, u, d, y,  , h, a, r, d,  , t, o,  , l, e, a, r, n,  , s, o,  , s, t, u, d, y,  , h, a, r, d]
        System.out.println("length for word3: " + word3.length);//length for word3: 63

        //s Stringindeki boşiluklar olamdan karakter sayısını hesaplayınız.
        String word4[] = s.replace(" ", "").split("");
        System.out.println(Arrays.toString(word4));//[I, l, i, k, e, j, a, v, a, b, u, t, J, a, v, a, n, e, e, d, s, t, o, s, t, u, d, y, h, a, r, d, t, o, l, e, a, r, n, s, o, s, t, u, d, y, h, a, r, d]
        System.out.println("length for word4: " + word4.length); //length for word4: 50

        //s stringindeki s lerin sayınız yazdırınızi. s strsinde kaç tane s karakteri vardır?
        //word4 = [I, l, i, k, e, j, a, v, a, b, u, t, J, a, v, a, n, e, e, d, s, t, o, s, t, u, d, y, h, a, r, d, t, o, l, e, a, r, n, s, o, s, t, u, d, y, h, a, r, d]
        int sCount = 0;
        for (int i = 0; i<word4.length; i++){
            if (word4[i].equals("s")){
                sCount++;
            }
        }

        System.out.println("number of s: " + sCount);//number of s: 4


    }
}
