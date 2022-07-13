package ÜslüSayiHesaplayanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k;
        int total=1;

        Scanner inp=new Scanner(System.in);
        System.out.print("Üssü alinicak sayi: ");
        n=inp.nextInt();
        System.out.print("Üs olacak Sayi: ");
        k=inp.nextInt();

        //3^4 = 3*3*3*3
        int i=1;
        while (i<=k){
                total*=n;
            i++;
        }
        System.out.println("Sonuç: "+total);

    }
}
