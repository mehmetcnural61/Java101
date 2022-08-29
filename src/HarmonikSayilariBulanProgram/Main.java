package HarmonikSayilariBulanProgram;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("N Sayisini giriniz: ");
        int n = input.nextInt();
        double result=0.0;

        //baş ve sonu biliyoruz
        for (int i = 1; i <= n; i++){
            result += (1.0/i);
        }
        // 1.Döngü i = 1; result = 0 + (1/1); 1;
        // 2.Döngü i = 2; result = 1 + (1/2); 1.5;

        System.out.println(result);
    }
}
