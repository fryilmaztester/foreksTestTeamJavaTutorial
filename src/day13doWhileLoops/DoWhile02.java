package day13doWhileLoops;



public class DoWhile02 {

    /*
    With Do-While Loop
     * 0 ile 100 arasindaki tek sayilari ayzdirinizx.
     */


    public static void main(String[] args) {

        /*
        for (int i = 0; i<=100; i++){
            if (i%2!=0){

            }
        }


         */

      int i = 0;

        do {

            if (i%2 != 0){
                System.out.print(i + " ");
            }
            i++;
        }while (i<=100);

    }

}
