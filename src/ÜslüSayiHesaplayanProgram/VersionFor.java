package ÜslüSayiHesaplayanProgram;

import java.util.Scanner;

public class VersionFor {
    public static void main(String[] args) {
        int a,b;
        int total=1;
        Scanner inp=new Scanner(System.in);

        System.out.print("Üssü alınıcak Sayi: ");
        a=inp.nextInt();
        System.out.print("Üs olucak Sayi: ");
        b=inp.nextInt();

        for (int i=1; i<=b; i++){
            total*=b;
        }
        System.out.println("Cevap: "+total);
    }
}
