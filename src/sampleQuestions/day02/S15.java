package sampleQuestions.day02;

public class S15 {
    public static void main(String[] args) {
        //Soru 15-)
        //Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
        //-> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
        //-> ilk sözcükte tek sayıda karakter  varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
        //Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
        //Örn:
        //	 isim1= masa
        //         isim2= ali
        //	 Konsol => maalisa

        String isim1="cana";
        String isim2="ahmet";
        int orta =isim1.length()/2;


        if (isim1.length()%2!=0) {
            System.out.println("isim2, isim1'e eklenemez");
        }else {
            System.out.println(isim1 = isim1.substring(0,orta).concat(isim2).concat(isim1.substring(orta)));
        }


    }
}
