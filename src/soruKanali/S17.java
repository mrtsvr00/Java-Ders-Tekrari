package soruKanali;

public class S17 {
    public static void main(String[] args) {
        //Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        // ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
        //Örnek:
        //char ch1='a'
        //String name ="Ali bakkala geç gitti."
        //Beklenen Çıktı=a sayısı = 3
        //Ipucu:
        //Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
        // Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini Loop içindeki İf ile bulabilirsiniz!

        char girilenHarf='a';
        String girilenIsim="hasan cemil can aanstasia";
        boolean flag=true;
        int sayac=0;

        while(flag){

            for (int i = 0; i <=girilenIsim.length()-1 ; i++) {

                if (girilenIsim.charAt(i)==girilenHarf){
                    sayac++;
                }else {
                    flag=false;
                }

            }

        }
        System.out.println(sayac + " adet harf icerir");
    }
}
