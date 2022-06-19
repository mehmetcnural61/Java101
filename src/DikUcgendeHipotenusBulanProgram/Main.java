package DikUcgendeHipotenusBulanProgram;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kenar1,kenar2;
        double kenar3;

        Scanner kullGiris = new Scanner(System.in);

        System.out.print("Birinci Kenari Giriniz : ");
        kenar1=kullGiris.nextInt();
        System.out.print("Ikinci Kenari Giriniz :");
        kenar2= kullGiris.nextInt();

        kenar3=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        System.out.println("Hipotenus = " + kenar3);


    }
}
