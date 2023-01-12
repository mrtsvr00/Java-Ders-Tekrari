package sampleQuestions.day04;

public class Q2 {
    //Soru29-)
    //1'den 100'e kadar olan doğal sayıların toplamını bulmak için bir Program yazın.
    //İpucu: Loop kulanabilirsiniz

    public static void main(String[] args) {

        int toplam=0;

        for (int i = 1; i < 100 ; i++) {
            toplam+=i;

        }
        System.out.println(toplam);
    }
}
