package KDVTutariHesaplayanProgram;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double Ucret,kdvOrani= 0.18,kdvTutar,kdvliTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Ucret Tutarini Giriniz: ");

         Ucret =input.nextDouble();
         kdvTutar = Ucret * kdvOrani;
         kdvliTutar = Ucret + kdvTutar;

        System.out.println("KDV'siz Tutar :"+ Ucret);
        System.out.println("KDV Orani :"+ kdvOrani);
        System.out.println("KDV Tutari :" +kdvTutar);
        System.out.println("KDV'li Tutari :" +kdvliTutar);



    }
}
