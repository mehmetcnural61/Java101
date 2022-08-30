package FibonacciSerisiOdev;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int n1=0,n2=1,n3,i,n;
        System.out.print("N Sayısını Girin:");
        n = input.nextInt();
        //0 ve 1 yazdırıyoruz
        System.out.print(n1+" "+n2);

      //Döngü 2 den başlıyor -> ilk 2 terim 0 ve 1 her zaman yazılacak
        for(i=2;i<n;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();

    }
}
