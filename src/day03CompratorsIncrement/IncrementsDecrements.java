package day03CompratorsIncrement;

public class IncrementsDecrements {


    /*
    Increment--> Artırma Operations ---> Toplama, Carpma Islemi
    Decrement --> Azaltman Operatiosn ---> Cıkartma, Bolme Islemi
     */
    public static void main(String[] args) {


        //1.Yol (Cok fazla kulkanılmıyor )
        int i01 = 12;
        System.out.println("i01: " + i01); //12

        i01 = i01 + 5;
        System.out.println("1.Yol ile: " + i01);//1.Yol ile: 17

        //2.Yol
        i01 += 4;
        System.out.println("2.Yol ile:  "+ i01); //2.Yol ile:  21

        //3.Yol --> Eger verinin "1" artıcaksak kullanılır. Daha cok loop lar ile birlikte kullanıyoruz.
        i01++;
        System.out.println("3.Yol ile Bir Artırma: " + i01); //3.Yol ile Bir Artırma: 22

        System.out.println(i01++); //22


        int i2 = 8;
        //1.Yol ile 3 artırnız
        System.out.println(i2 = i2 + 3); //11
        //2.Yol ilse 2 cıakrıtnız
        System.out.println(i2 -= 2);//9
        //3.Yol ile toplama islemi yapınız.
        i2++;
        System.out.println(i2);//10






    }
}
