package ForVsWhile;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int sayi;

        for (boolean run =true; run;){

            System.out.print("Sayi Giriniz: ");
            sayi=input.nextInt();
            if (sayi < 0){
                run=false;
            }
        }



    }
}
