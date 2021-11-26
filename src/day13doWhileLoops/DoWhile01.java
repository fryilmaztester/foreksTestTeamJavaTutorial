package day13doWhileLoops;

public class DoWhile01 {

    public static void main(String[] args) {


        int i = 1;
        while (i>1){
            System.out.println("This is While Loop");
            i++;
        }

/*
Do-While Loop ta ilk olarak kod bloğu çalışır (execute) sonrasında şart kontrol edilir.
Kod bloğu her şartta en az bir kere çalışır.
 */
        do {
            System.out.println("This is Do While Loop");
            i--;
        }while (i>1);


    }

}
