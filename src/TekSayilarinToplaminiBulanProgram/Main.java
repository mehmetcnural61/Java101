package TekSayilarinToplaminiBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m;
        int toplam=0;

        Scanner input=new Scanner(System.in);

        do {
            System.out.print("Sayi Giriniz: ");
            m =input.nextInt();
            if (m % 2 ==1){
                toplam +=m;
                //toplam = toplam +m;
            }
        }while (m>0);
        System.out.println("Toplam: "+toplam);
    }
}
