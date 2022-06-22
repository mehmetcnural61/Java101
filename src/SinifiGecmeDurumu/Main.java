package SinifiGecmeDurumu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik;
        double notOrtalama=0;
        int sayac=0;
        int toplam=0;


        Scanner input= new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat= input.nextInt();
        if (0<= mat && mat <=100){
            toplam+=mat;
            sayac++;
        }else {
            System.out.println("Gecersiz Bir Not Girdiniz");
        }

        System.out.print("Fizik notunuz: ");
        fizik= input.nextInt();
        if (0<= fizik && fizik <=100){
            toplam+=fizik;
            sayac++;
        }else {
            System.out.println("Gecersiz Bir Not Girdiniz");
        }

        System.out.print("Turkce notunuz: ");
        turkce= input.nextInt();
        if (0<= turkce && turkce <=100){
            toplam+=turkce;
            sayac++;
        }else {
            System.out.println("Gecersiz Bir Not Girdiniz");
        }

        System.out.print("Kimya notunuz: ");
        kimya= input.nextInt();
        if (0<= kimya && kimya <=100){
            toplam+=kimya;
            sayac++;
        }else {
            System.out.println("Gecersiz Bir Not Girdiniz");
        }

        System.out.print("Muzik notunuz: ");
        muzik= input.nextInt();
        if (0<= muzik && muzik <=100){
            toplam+=muzik;
            sayac++;
        }else {
            System.out.println("Gecersiz Bir Not Girdiniz");
        }

        notOrtalama = toplam/sayac;

        if (notOrtalama<55){
            System.out.println("Ne yazikki Sinifta Kaldiniz");
        }else{
            System.out.println("Basari ile Gectiniz.");
        }
        System.out.print("Ortalamaniz : "+ notOrtalama);


    }
}
