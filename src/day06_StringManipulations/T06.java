package day06_StringManipulations;

public class T06 {
    public static void main(String[] args) {


        //Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        //:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        //yazdirin

        String str="cana";
        System.out.println(str.length());//15
        int orta=str.length()/2;

        if (str.length()%2==0) {
            System.out.println((str.length()) / 2);

            str=str.replaceFirst(str.substring(orta), ":)"+str.substring(orta));
            System.out.println(str);
        }else {
            System.out.println(str.replaceFirst(str.substring(orta), ":("));
        }

    }
}
