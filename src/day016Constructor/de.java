package day016Constructor;

public class de {

    public static void main(String[] args) {
        System.out.println(is(99));
    }

    public static boolean is(int n){

        boolean isTek = true;
        for (int i = 0; i<n; i++){
            isTek = !isTek;
            System.out.println("isTEkk: " + isTek);
        }
        return isTek;
    }
}
