package day32_set_maps;

import java.util.Map;

public class C08_SubeListesiYazdirma {
    public static void main(String[] args) {

        // verilen sinif ve sube ismi ile sinif listesini yazdiran method olusturun

        Map<Integer,String> ogrenciMap=MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.subeListesiYazdirma(ogrenciMap,"10","k");




    }
}
