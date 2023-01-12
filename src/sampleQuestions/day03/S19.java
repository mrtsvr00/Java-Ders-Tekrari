package sampleQuestions.day03;

import java.util.Scanner;

public class S19 {
    public static void main(String[] args) {

        //Soru 19-)
        //Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
        //ipucu:
        //Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen kacinci ayda dogdugunuzu giriniz");
        int ay=scan.nextInt();
        System.out.println("lutfen ayin hangi gununda dogdugunuzu giriniz");
        int gun=scan.nextInt();
        System.out.println("burcunuz : " + burcBulma(ay, gun));


    }
        public static String burcBulma(int ay,int gun){
            String burc="";

            switch (ay){
                case 1 : burc=gun>=21 ? "kova" : "oglak ";break;
                case 2 : burc=gun>=21 ? "balik" : "Kova ";break;
                case 3 : burc=gun>=21 ? "koc" : "balik";break;
                case 4 : burc=gun>=21 ? "boga" : "Koc ";break;
                case 5 : burc=gun>=21 ? "ikizler" : "boga ";break;
                case 6 : burc=gun>=21 ? "yengec" : "ikizler";break;
                case 7 : burc=gun>=21 ? "aslan" : "yengec";break;
                case 8 : burc=gun>=21 ? "basak" : "aslan ";break;
                case 9 : burc=gun>=21 ? "terazi" : "basak ";break;
                case 10 : burc=gun>=21 ? "akrep" : "terazi ";break;
                case 11 : burc=gun>=21 ? "yay" : "akrep ";break;
                case 12 : burc=gun>=21 ? "oglak" : "yay ";break;
                default: System.out.println("gecersiz giris");
            }
            return burc;




    }
}
