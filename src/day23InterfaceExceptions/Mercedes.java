package day23InterfaceExceptions;

public class Mercedes implements DısGorunus,IcGorunus,Kozmetik {


    @Override
    public void tire() {
        System.out.println("Kıslık Lastik Takılı Değil");
    }

    @Override
    public void clean() {
        System.out.println("Arabanın dışı temizdir.");
    }

    @Override
    public void headLight() {
        System.out.println("Dış ışıklandırması bulunmamaktadır. ");
    }

    @Override
    public void seat() {
        System.out.println("Koltular deridir.");
    }

    @Override
    public void radio() {
        System.out.println("Radio kullanılabilir durumdadır");
    }

    @Override
    public void icKaplama() {
        System.out.println("İc Kaplaması süettir ");
    }

    @Override
    public void color() {
        System.out.println("Arabaının rengi kırmızıdır");
    }

    @Override
    public void window() {
        System.out.println("Pencere geniş değildir. ");
    }

    public static void maker(){
        System.out.println("Marka: Mercedes C180");
    }









}
