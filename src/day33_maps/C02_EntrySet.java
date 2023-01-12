package day33_maps;

import day32_set_maps.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {

        // tum ogrencileri 101=Ali,Can,11,H,MF seklinde yazdirin

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        //{101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF}


        Set<Integer> ogrenciNoSeti=ogrenciMap.keySet();
        System.out.println(ogrenciNoSeti);

        for (Integer eachKey:ogrenciNoSeti
             ) {
            System.out.println(eachKey+"="+ogrenciMap.get(eachKey));

        }

        //  Entry<Integer,String>
        Set<Map.Entry<Integer, String>> ogrenciEntrySet = ogrenciMap.entrySet();
        System.out.println("No Ogrenci Bilgileri");
        System.out.println("=========================");

        for (Map.Entry<Integer, String> eachEntry : ogrenciMap.entrySet()
        ) {
            System.out.println(eachEntry);

        }


    }
}
