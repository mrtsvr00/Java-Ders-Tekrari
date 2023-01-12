package day32_set_maps;

import java.util.Map;

public class C06_Value {
    public static void main(String[] args) {


        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        // verilen ismin ogrenciMap te olup olmadigini kontrol edip
        // true veya false donen method olusturun

        boolean sonuc=MapMethodDepo.isimIleOgrenciArama(ogrenciMap,"Ali");
        System.out.println(sonuc);

        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMap, "Kamil"));
        System.out.println(MapMethodDepo.isimIleOgrenciArama(ogrenciMap, "Sevgi"));

    }

}
