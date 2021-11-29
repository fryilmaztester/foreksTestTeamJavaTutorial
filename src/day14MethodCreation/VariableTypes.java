package day14MethodCreation;

import java.util.ArrayList;
import java.util.List;

public class VariableTypes {


    String newsTitle;
    String newsTitle01 = "Foreks";
    int i;
    static float f;
    static boolean isLetter;
    static  int n;
    static long l;
    static char c;
    static String str;

    public static void main(String[] args) {

        System.out.println("f nin değeri: " + f);//0.0
        System.out.println("isLetter ın değeri: " + isLetter);//false
        System.out.println("n in değeri: " + n);//0
        System.out.println("l in değeri: " + l);//0
        System.out.println("c nin değeri: " + c);//0
        System.out.println("str nin değeri: " + str); //null

        List<String> strLi = new ArrayList<>();
        System.out.println(strLi);


    }


    /*
    Local Variable
    1) Main methodun içinde ve ya başka bir metodun içinde create edilmiş variablelerdir.
    2)Local Variable lare sadece bulunduğu metotdan erişebiliriz.
     */


    public  void  set(){
        newsTitle = "Tr de Enflasyon 5 in altına indi";
    }

    public void set01(){
        newsTitle = "FRY";
        i = 4;
    }


    /*
    Instance Variable

   1)Main metodun ve ya create etmiş olduğumuz diğer mettoalrın dışında oluşturulmuş variablelerdir.
   2)Class scope unda oluşturulan variablalerdır.
   3) Initialize edilebilir de edilmeyebilirde.
   Initialize --> Değer atamısı yapmaıktır.


   //Static olan metot da sadece static oalrak tanımlanmış varibları kullanabilrim.

   Instance variablearlda eğer init. işlemi yapılmamışsa
    Java farklı data typelar için default olarak  değer ataması yapar.

    float --> 0.0
    boolean --> false
    int --> 0
    byte--> 0
    short --> 0
    long --> 0




     */
}
