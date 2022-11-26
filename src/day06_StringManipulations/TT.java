package day06_StringManipulations;

public class TT {
    public static void main(String[] args) {
        //Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        //:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        //yazdirin

        String str="canaki";
        int orta=str.length()/2;

        if (str.length()%2==0)
            System.out.println(str.replace(str.substring(orta),":)"+ str.substring(orta)));
        else
            System.out.println(str.replace(str.substring(orta,orta+1),":("));


    }
}
