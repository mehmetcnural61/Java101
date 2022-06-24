package ArtikYilHesaplama;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;
        String artikYilmi="";

        Scanner input=new Scanner(System.in);

        System.out.print("Yil Giriniz: ");
        yil=input.nextInt();

        if (yil%400==0){
            artikYilmi="Artik Bir Yildir ";
        }else
            artikYilmi="Artik Bir Yil Değildir! ";

        System.out.println(yil+" "+artikYilmi);

    }
}
