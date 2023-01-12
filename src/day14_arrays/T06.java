package day14_arrays;

public class T06 {
    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] arr ={"Hasan", "Ilker","Senturk","Omer Faruk"};
        enUzunEnKisaIsimleriYazdir(arr);




    }
    public static void enUzunEnKisaIsimleriYazdir(String []arr){
        String enUzunKelime=arr[0];
        String enUKisaKelime=arr[0];

        for (int i = 1; i <arr.length ; i++) {

            if (arr[i].length()>=enUzunKelime.length()){
                enUzunKelime=arr[i];
            }
            if (arr[i].length()<=enUKisaKelime.length()){
                enUKisaKelime=arr[i];

            }

        }
        System.out.println(enUzunKelime +"\n" + enUKisaKelime);

        }

    }

