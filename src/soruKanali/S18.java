package soruKanali;

public class S18 {
    public static void main(String[] args) {
        // Soru 18-) Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
        // Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
        // İpucu:
        // yol=Hız*zaman


        int hiz=90;
        int yol=360;

        System.out.println(zamanHesapla(hiz, yol));

    }
    public static int zamanHesapla(int hiz,int yol){

        int zaman=yol/hiz;

        return zaman;
    }
}
