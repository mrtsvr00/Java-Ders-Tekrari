package soruKanali;

import java.util.Scanner;

public class S06 {
    //Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
    // Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
    // 1 şeker = 1.5 gr
    //1 kg = 1000 gram      olarak hesaplayınç
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("gunde kac bardak cay ictiginizi giriniz");
        int bardakCay=scan.nextInt();
        System.out.println("caya kac seker attiginizi giriniz");
        double seker= scan.nextDouble();

        int yillikCayTuketimi=365*bardakCay;
        double yillikSekerKullanimiKg=(365*bardakCay*1.5*seker)/1000;

        System.out.println("yillik :" + yillikCayTuketimi + " bardak cay , " + yillikSekerKullanimiKg + " kg seker kulaniyorsunuz");





    }
}

