package HavaSicakliginaGoreEtkinlikOnerme;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*

    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
    Ödev
    Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
 */

        int sicaklik;

        Scanner input= new Scanner(System.in);
        System.out.print("Sicaklik Giriniz: ");
        sicaklik= input.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak Yapabilirsiniz. ");
        } else if ( sicaklik <=25 ) {
            if (sicaklik < 15){
                System.out.println("Sinemaya Gidebilirsiniz. ");
            }
            if (sicaklik >= 10){
                System.out.println("Piknige Gidebilirsiniz. ");
            }
        } else {
            System.out.println("Yuzmeye Gidebilirsiniz. ");
        }

    }
}
