package TaksimetreHesaplayanProgram;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int km;
        double perKm = 2.20 , total = 10;

        Scanner input =new Scanner(System.in);
        System.out.println("Per KM Price 2.20 TL & The minimum amount to be paid is 20 TL & Taximeter opening is 10 TL. ");
        System.out.print("Enter Distance in KM: ");
        km=input.nextInt();

        //total = total +(km * perKm);
        total += km * perKm;

        total=(total<20) ? 20 : total;
        System.out.println("Total Amount of payment: " + total + " TL");
    }
}
