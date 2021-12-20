package day17ArrayStatic;

public class Array02 {

    public static void main(String[] args) {


        char chArr [] = {'a', 'b', 'c', 'd', 'e','f'}; //f, e, d, c, b, a

        System.out.println(chArr.length);//6


        //chArr arrayinde bulunan elemanları tersten yazdırınız
        //length -1

       // System.out.println(chArr[chArr.length-1]); //f

        for (int i = chArr.length-1; i>=0; i--){
            System.out.print(chArr[i] + " "); //f e d c b a
        }

        System.out.println("---------------------------");

        // arraydeki cift sayilere denk gelenleri yazdiriniz.
        for (int i = 0; i<chArr.length; i++){
            if (i%2 == 0){
                System.out.print(chArr[i] + " "); //a,c,e
            }
        }
    }
}
