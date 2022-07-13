package TekSayilarinToplaminiBulanProgram;

import java.util.Scanner;

public class OdevTekSayi {
    public static void main(String[] args) {
    int m;
    int total=0;

        Scanner input=new Scanner(System.in);

        do {
            System.out.print("Sayi Giriniz: ");
            m=input.nextInt();
            if ( m % 2== 0 && m % 4 == 0 ){
                total+=m;
            }

        }while ( m%2 !=1 && m%4 !=1 );
        System.out.println("2 ve 4 Katlari olan Sayi Toplamları: "+total);

    }
}
