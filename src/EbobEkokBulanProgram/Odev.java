package EbobEkokBulanProgram;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayisiniz giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 Sayisini giriniz: ");
        int n2 = input.nextInt();
        int ekok;
        int ebob;

        ekok = (n1 > n2) ? n1 : n2;

        while (true) {
            if (ekok % n1 == 0 && ekok % n2 == 0) {
                System.out.printf("%d ve %d sayılarinin Ekok'u %d dir.", n1, n2, ekok);
                break;
            }
            ++ekok;
        }
        System.out.println();

        int i = n1;
        while (i >= 1) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                ebob=i;
                System.out.printf("%d ve %d sayılarinin Ebob'u %d dir.", n1, n2, ebob);


                break;
            } else {
                i--;
            }


        }
    }
}
