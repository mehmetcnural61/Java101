package FaktoriyelHesaplayanProgram;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int nFact=1,rFact=1,n,r,formula,subs,sFact=1;
        //subs=subtraction

        Scanner input=new Scanner(System.in);

        System.out.print("N elemanını giriniz: ");
        n=input.nextInt();
        System.out.print("R elemanını giriniz: ");
        r=input.nextInt();

        for (int i=1;i<=n;i++){
            nFact*=i;
        }
        for (int a=1; a<=r; a++){
            rFact*=a;
        }
        subs= (n-r) ;
        for (int b=1; b<= subs; b++){
            sFact*=b;
        }
        formula=nFact/(rFact*sFact);
        System.out.println("C("+n+","+r+")="+formula);

    }
}
