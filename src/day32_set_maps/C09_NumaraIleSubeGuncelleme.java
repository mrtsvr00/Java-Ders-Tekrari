package day32_set_maps;

import java.util.Map;

public class C09_NumaraIleSubeGuncelleme {
    public static void main(String[] args) {

        // Numarasi verilen ogrencinin sube ismini
        // verilen sube yapan bir method olusturun

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();// 101, "Ali-Can-11-H-MF"

        ogrenciMap=MapMethodDepo.numaraIleSubeDegistirme(ogrenciMap,104,"M");
        System.out.println(ogrenciMap);









    }
}
