package day32_set_maps;

import javax.imageio.stream.ImageInputStream;
import java.util.*;

public class MapMethodDepo {
    public static Map<Integer, String> ogrenciMapOlustur() {

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");

        return ogrenciMap;

    }

    public static boolean isimIleOgrenciArama(Map<Integer, String> ogrenciMap, String isim) {

        Collection<String> valuesCollection = ogrenciMap.values();

        for (String eachValue : valuesCollection
        ) {
            String[] valueArr = eachValue.split("-");

            if (valueArr[0].equalsIgnoreCase(isim)) {
                return true;
            }


        }
        return false;
    }

    public static void soyisimIleOgrenciListesiYazdir(Map<Integer, String> ogrenciMap, String soyisim) {
        // ogrenci map'te aradigimiz soyisimdeki ogrencilerin
        // isim,soyisim,sinif ve sube bilgilerini
        // bir tablo olarak yazdiran bir method olusturun

        Collection<String> valuesCollection = ogrenciMap.values();

        System.out.println("isim soyisim sinif sube");
        System.out.println("========================");

        for (String eachValue : valuesCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valueSoyisim = valueArr[1];

            if (valueSoyisim.equalsIgnoreCase(soyisim)) {
                System.out.println(valueArr[0] + " " +
                        valueArr[1] + " " +
                        valueArr[2] + " " +
                        valueArr[3]);

            }

        }

    }

    public static void subeListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif, String sube) {

        // verilen sinif ve sube ismi ile sinif listesini yazdiran method olusturun

        Collection<String> valuesCollection = ogrenciMap.values();

        System.out.println("isim soyisim sinif sube bolum");
        System.out.println("==============================");

        for (String eachValue : valuesCollection
        ) {
            String[] valueArr = eachValue.split("-");
            String valueSinif = valueArr[2];
            String valueSube = valueArr[3];

            if (valueSinif.equalsIgnoreCase(sinif) && valueSube.equalsIgnoreCase(sube)) {
                System.out.println(valueArr[0] + " " +
                        valueArr[1] + " " +
                        valueArr[2] + " " +
                        valueArr[3] + " " +
                        valueArr[4]);
            }


        }
    }

    public static Map<Integer, String> numaraIleSubeDegistirme(Map<Integer, String> ogrenciMap, int okulNo, String yeniSubeIsmi) {

        // Numarasi verilen ogrencinin sube ismini
        // verilen sube yapan bir method olusturun

        String ogrenciValue = ogrenciMap.get(okulNo);

        String[] valueArr = ogrenciValue.split("-");

        valueArr[3] = yeniSubeIsmi;

        String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" +
                valueArr[3] + "-" + valueArr[4];

        ogrenciMap.put(okulNo, yeniValue);

        return ogrenciMap;


    }

    public static void sinifListesiYazdirma(Map<Integer, String> ogrenciMap, String sinif) {

        //verilen siniftaki ogrencilerin no isim soyisim bolumlerini
        //bir liste olarak yazdiran bir method olusturun

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        System.out.println("no isim soyisim bolum");
        System.out.println("=======================");

        for (Map.Entry<Integer, String> eachEntry : ogrenciMap.entrySet()) {

            String entryValue = eachEntry.getValue();
            Integer entryKey = eachEntry.getKey();

            String[] entryValueArr = entryValue.split("-");

            if (entryValueArr[2].equalsIgnoreCase(sinif)) {
                System.out.println(entryKey + " " + entryValueArr[0] + " " + entryValueArr[1] + " " + entryValueArr[4]);
            }


        }


    }

    public static void bolumListesiOlusturma(Map<Integer, String> ogrenciMap, String bolum) {

        //verilen bolumdeki ogrencilerin
        //No isim soyisim ve siniflarini yazdiran
        //bir method olusturun

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        System.out.println("No isim soyisim  sinif");
        System.out.println("=======================");

        for (Map.Entry<Integer, String> eachEntry : ogrenciMap.entrySet() //101, "Ali-Can-11-H-MF"
        ) {
            String entryValue = eachEntry.getValue();
            String[] entryvalueArr = entryValue.split("-");

            if (entryvalueArr[4].equalsIgnoreCase(bolum)) {
                System.out.println(eachEntry.getKey() + " " + entryvalueArr[0] + " " + entryvalueArr[1] + " " + entryvalueArr[2]);
            }


        }


    }

    public static Map<Integer, String> soyIsimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : ogrenciMap.entrySet()
        ) {
            String entryValue = eachEntry.getValue();
            String[] entryValueArr = entryValue.split("-");

            System.out.println(eachEntry.getKey() + " " + entryValueArr[0] + " " + entryValueArr[1].toUpperCase() + " ");

        }
        return ogrenciMap;


    }


    public static Map<Integer, String> siniflariArtir(Map<Integer, String> ogrenciMap) {

        // ogrenci map'indeki tum sinif degerlerinin bir artirin
        // 12'nci sinifta olan varsa sinif bilgisini mezun yapin

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        for (Map.Entry<Integer, String> eachEntry : ogrenciMap.entrySet()//101, "Ali-Can-11-H-MF"
        ) {
            String eachValue = eachEntry.getValue();
            String[] eachValueArr = eachValue.split("-");

            int sinifInt = Integer.parseInt(eachValueArr[2]);

            if (sinifInt == 12) {
                eachValueArr[2] = "mezun";


            } else {
                eachValueArr[2] = sinifInt + 1 + "";

            }
            eachEntry.setValue(eachValueArr[0] + "-" +
                    eachValueArr[1] + "-" +
                    eachValueArr[2] + "-" +
                    eachValueArr[3] + "-" +
                    eachValueArr[4]);


        }
        return ogrenciMap;


    }

    public static void sinifSiraliListeYazdir(Map<Integer, String> ogrenciMap) {

        // tum ogrenci listesini
        // sinif sube isim soyisim no seklinde
        // dogalsirali olarak
        // yazdiran bir method olusturun

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();
        Set<String> siraliOgrenciSeti = new TreeSet<>();

        System.out.println("sinif sube isim soyisim no");
        System.out.println("==========================");

        for (Map.Entry<Integer, String> eachEntry : ogrenciMap.entrySet()
        ) {
            String eachValue = eachEntry.getValue();
            String[] valueArr = eachValue.split("-");//101, "Ali-Can-11-H-MF"

            String istenenFormattakiBilgi = valueArr[2] + " " + valueArr[3] + " " + valueArr[0] + " " + valueArr[1] + " " + eachEntry.getKey();

            siraliOgrenciSeti.add(istenenFormattakiBilgi);

            System.out.println("sinif sube isim soyisim no");
            System.out.println("==========================");

            for (String each : siraliOgrenciSeti) {
                System.out.println(each);

            }


        }
    }

    public static void isimSoyisimSiraliListeYazdir(Map<Integer, String> ogrenciMap) {

        // // tum ogrenci listesini isim soyisim no sinif sube bolum
        //        // seklinde sirali olarak yazdiran bir method olusturun

        Set<Map.Entry<Integer, String>> entrySeti = ogrenciMap.entrySet();

        Set<String>isimSoyisimSiraliSet=new TreeSet<>();

        for (Map.Entry<Integer, String> eachEntry : ogrenciMap.entrySet()
        ) {
            String eachValue=eachEntry.getValue();
            String[]eachValueArr=eachValue.split("-");

            String istenenFormattakiBilgi=eachValueArr[0] + " " + eachValueArr[1] + " " +eachEntry.getKey() + " " +
                                            eachValueArr[2] + " " + eachValueArr[3] + " " + eachValueArr[4];

            isimSoyisimSiraliSet.add(istenenFormattakiBilgi);




            }
        System.out.println("isim soyisim no sinif sube bolum");
        for (String each:isimSoyisimSiraliSet
        ) {
            System.out.println(each);


        }


    }
}

