package day07_forLoops;

public class T09 {
    public static void main(String[] args) {
        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        String str="Java candir";


        for (int i = str.length()-1; i>=0 ; i--) {
            System.out.print(str.charAt(i));


        }
    }
}
