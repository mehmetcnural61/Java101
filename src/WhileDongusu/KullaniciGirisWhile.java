package WhileDongusu;
import java.util.Scanner;

public class KullaniciGirisWhile {
    public static void main(String[] args) {

        int psw;
        boolean isPswrdSuccess=true;

        Scanner inp=new Scanner(System.in);


        while (!isPswrdSuccess){
            System.out.print("Enter Password : ");
            psw=inp.nextInt();
            if(psw ==123 ){
                System.out.println("Doğru !");
                isPswrdSuccess=false;
            }else {
                System.out.println("Yanlis !");
            }
        }

    }
}
