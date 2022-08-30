package MukemmelSayiOdev;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;

        Scanner sayial = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = sayial.nextInt();

        for (int i=1;i<number;i++){
            if (number % i == 0){
                total = total +i;
            }
        }
        if (total == number){
            System.out.println("Mükemmel Sayıdır "+ number);
        }else{
            System.out.println("Mükemmel Sayı Değildir! "+number);
        }
    }
}
