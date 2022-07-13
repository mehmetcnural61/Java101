package GirilenSayiyaKadarİkininKuvvetleri;

import java.util.Scanner;

public class DortVeBesKuvvetleri {
    public static void main(String[] args) {

        int m ;

        Scanner input= new Scanner(System.in);

        System.out.print("Limit Belirlediğiniz Sayıyi Giriniz: ");
        m=input.nextInt();

        System.out.println(m+" Sayisindan kücük 4'ün Kuvvetleri: ");
        for(int a=1; a<=m; a*=4){
            System.out.println(a+" ");
        }
        System.out.println(m+" Sayisindan kücük 5'in Kuvvetleri: ");
        for (int a=1; a<=m; a*=5){
            System.out.println(a+" ");
        }

    }
}
