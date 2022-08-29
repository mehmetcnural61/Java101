package YıldizlarUcgenYapimi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.print("Basamak Sayisini Giriniz: ");
        int n = input.nextInt();

        // 1'den 6'ya
        for (int i  = 1; i <= n; i++ ){

            //boşluk bırakıyoruz

            for(int k = 1; k <=(n-i); k++ ){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++ ){
                System.out.print("*");
            }
            System.out.println();

        }
//Tersine Yildizlar
        for (int i = (n-1); i >=1; i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
