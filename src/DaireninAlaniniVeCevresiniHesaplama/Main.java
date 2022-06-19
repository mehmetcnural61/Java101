package DaireninAlaniniVeCevresiniHesaplama;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int r;
    double π= 3.14;
    double merkezAci = 0;


    Scanner inp=new Scanner(System.in);

    System.out.print("Dairenin yaricapini giriniz: ");
    r=inp.nextInt();

    //Alan Formülü : π * r * r;
    double alan= π * r *r ;
    //Çevre Formülü : 2 * π * r;
    double cevre = 2 * π * r;

        System.out.println("Dairenin Alani: " + alan);
        System.out.println("Dairenin Cevresi: " + cevre );

        System.out.print("Merkez Acisini giriniz: ");
        merkezAci= inp.nextInt();

    double MerkezAlan = π * r * r * merkezAci /360;
        System.out.println("Merkez Acisi verilen daire diliminin Alani: " + MerkezAlan);


    }
}
