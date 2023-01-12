package sampleQuestions.day02;

public class S13 {
    //Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
    //Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
    //Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
    //Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
    //Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
    //Ipucu:
    //Switch konusunu hatırlayalım!
    public static void main(String[] args) {

        char chr='a';
        System.out.println(chr);

        switch (chr){
            case 'a' :
                System.out.println("İsteğiniz işleniyor");
                break;
            case 'b' :
                System.out.println("Değerlendirmeniz için yine de teşekkür ederiz");
                break;
            case 'c' :
                System.out.println("Üzgünüm şuanda yardımcı olamıyoruz");
                break;
            default:
                System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
        }

    }
}
