package VucutKitleIndeksiHesaplama;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kg,boy;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lutfen Boyunuzu 'Metre' cinsinde giriniz: ");
        boy=inp.nextDouble();

        System.out.print("Lutfen Kilonuzu giriniz: ");
        kg=inp.nextDouble();

        double vKitle = kg / (boy * boy);
        System.out.println("Vucut kitle indeksiniz: "+ vKitle);

    }
}
