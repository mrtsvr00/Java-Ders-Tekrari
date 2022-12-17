package soruKanali;

public class S20 {
    public static void main(String[] args) {

        //Soru 20-)
        //Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır.
        //Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
        //Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ;
        //aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"
        //yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.
        //
        // Örnek:
        // giriş: ama
        // çıkış: Dizede yinelenen karakterler var
        // İpucu: İf Else ve Char kullanarak çözebiliriz.

        String isim="cem2";
        char harf='c';

        for (char i = 0; i <isim.length() ; i++) {
            if (isim.charAt(i)==harf){
                System.out.println("Dizede yinelenen karakterler var");
                break;
            }else {
                System.out.println("String benzersiz karakterlere sahip");
                break;
            }


        }
        if (isim.length()>3) System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");



    }
}
