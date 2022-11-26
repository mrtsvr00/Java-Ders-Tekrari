package day12_methodOlusturma;

public class C04 {

    //Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
    //bolenleri sayisini bulup bize donduren bir method olusturun.

    public static void main(String[] args) {

        int sayi=78;
        System.out.println(tamBolenDondur(56));
    }
    public static int tamBolenDondur(int sayi){
        int pozitifBolenler=0;
        for (int i = 1; i <= sayi ; i++) {

            if (sayi%i==0){
                pozitifBolenler=i;
                System.out.print(i + " ");

            }


        }



        return pozitifBolenler;


    }

}
