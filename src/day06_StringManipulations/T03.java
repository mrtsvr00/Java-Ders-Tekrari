package day06_StringManipulations;

public class T03 {
    public static void main(String[] args) {


        //Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        //sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        //input : java1 ogRe2@nMek3 #ne +Gu=zel
        //output : Java ogrenmek ne guzel.

        String input = "java1 ogRe2@nMek3 #ne +Gu=zel";

        System.out.println(input=input.replaceAll("\\d", ""));//java ogRe@nMek #ne +Gu=zel

        System.out.println(input=input.replace(' ', '0'));//java0ogRe@nMek0#ne0+Gu=zel

        System.out.println(input = input.replaceAll("\\W", ""));//java0ogRenMek0ne0Guzel

        System.out.println(input = input.replace('0', ' '));

        System.out.println(input=input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase());//Java ogrenmek ne guzel


    }
}
