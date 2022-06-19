package NotOrtalamasiHesaplayanProgram;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenler
        int Math,Physics,Chemistry,Turkish,History,Music;

        //Scanner
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan veri girişi

        System.out.print("Math Grade: ");
        Math = input.nextInt();

        System.out.print("Physics Grade: ");
        Physics = input.nextInt();

        System.out.print("Chemistry Grade: ");
        Chemistry = input.nextInt();

        System.out.print("Turkish Grade: ");
        Turkish =input.nextInt();

        System.out.print("History Grade: ");
        History =input.nextInt();

        System.out.print("Music Grade: ");
        Music =input.nextInt();

        double  sum = (Math+Physics+Chemistry+Turkish+History+Music);
        double average = sum / 6;
        System.out.println("Average Grade: "+average);
        System.out.println(average >= 60 ? "Sinifi Gecti" : "Sinifta Kaldi");


    }
}
