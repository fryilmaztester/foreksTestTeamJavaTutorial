package day02wrapperClass;

public class WrapperClass01 {


    /*
    1)Data Type yaz
    2)Data type name
    3)Equal --> =
    4)Assignmnet --> Atama İslemi
     */

    public static void main(String[] args) {

        /*
        int age; //Declartion--> 1 ve 2 .stepler
        age = 27; //Assignment İslemi  --> 2,3 ve 4. stepler

         */

        int age01 = 24;


        //Primitive Data Typeların iliskisi
        //byte<short<int<long<float<double


        int a = 22;
        int b= 2;

        double result = a/b;
        System.out.println("result: "+  result); //11 ?-- 11.0 -->result: 11.0


        char ch = 'a';
        System.out.println(ch); //a

       // int acsiiValueOfCh= ch;
        System.out.println("ASCII Table Valus: " + (ch +0));//ASCII Table Valus: 97


        /*
        int--> Integer
        double-->Double
        boolean-->Boolean
        char--> Character
         */


        //int
        String tc = "123214";
        System.out.println(tc + 2);//1232142
        System.out.println(Integer.parseInt(tc) + 2);


        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValues: " + maxValue); //maxValues: 2147483647









    }


}
