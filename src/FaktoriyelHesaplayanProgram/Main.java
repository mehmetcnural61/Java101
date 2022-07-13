package FaktoriyelHesaplayanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // n!=1*2*3*4*....*n
        Scanner inp=new Scanner(System.in);
        System.out.print("Faktöriyel Sayisi: ");

        int a=inp.nextInt();
        int total=1;

        for(int i=1; i<=a ; i++){
            total= total * i;

        }
        System.out.println(a+" Faktöriyel = "+total);
    }
}
