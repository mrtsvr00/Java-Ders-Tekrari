package sampleQuestions.day04;

public class Q7 {
    //Soru 34-)
    //Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.
    //
    //Örnek
    //String str : ade1r4d3
    //Int toplam : 8
    //İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
    //                  Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz


    public static void main(String[] args) {

        String str = "ade1r4d3";
        int toplam=0;

        for (int i = 0; i <str.length() ; i++) {

            if (Character.isDigit(str.charAt(i))){
            toplam+=Integer.valueOf(String.valueOf(str.charAt(i)));

        }








    }
        System.out.println(toplam);

}
}
