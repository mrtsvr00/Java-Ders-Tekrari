package soruKanali;

public class S01 {
    public static void main(String[] args) {


            //Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
            //Ipuclari:
            //* r=7;
            //* Pi=3.14
            //* Dairenin Cevresi : 2*Pi*r
            //* Dairenin Alani : Pi*r*r  (edited)

        int yaricap=7;
        double alan= 3.14 * yaricap*yaricap;
        double cevre=2 * 3.14 * yaricap;

        System.out.println(alan);
        System.out.println(cevre);

            //Soru-2)   SOUT/SYSO
            //Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
            //Ipuclari:
            //* Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
            //* Dikdortgenin Alani : uzun kenar * kisa kenar (edited)
            //

        int kenarKisa=5;
        int kenarUzun=10;

        int cevreDikD=2*(kenarKisa+kenarUzun);
        int alanDikD=kenarKisa*kenarUzun;
        System.out.println(cevreDikD);
        System.out.println(alanDikD);



    }
}
