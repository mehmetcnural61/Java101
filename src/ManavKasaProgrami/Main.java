package ManavKasaProgrami;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

double armutKilo =2.14, elmaKilo=3.67,domatesKilo=1.11,muzKilo=0.95,patlicanKilo=5.0;

double armutMiktar,elmaMiktar,domatesMiktar,muzMiktar,patlicanMiktar;

Scanner input=new Scanner(System.in);

        System.out.print("Armut Kac Kilo?: ");
        armutMiktar=input.nextDouble();

        System.out.print("Elma Kac Kilo?: ");
        elmaMiktar=input.nextDouble();

        System.out.print("Domates Kac Kilo?: ");
        domatesMiktar=input.nextDouble();

        System.out.print("Muz Kac Kilo?: ");
        muzMiktar= input.nextDouble();

        System.out.print("Patlican Kac Kilo?: ");
        patlicanMiktar=input.nextDouble();

        double toplamTutar;
        toplamTutar=((armutMiktar*armutKilo)+(elmaMiktar*elmaKilo)+(domatesMiktar*domatesKilo)+(muzMiktar*muzKilo)+(patlicanMiktar*patlicanKilo));
        System.out.println("Toplam Tutar: " +toplamTutar +" TL");

    }
}
