package UcakBiletFiyatHesaplama;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km,perKmPrice=0.1,totalPrice;
        int age ,choice;

        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi KM olarak Giriniz: ");
        km=input.nextDouble();

        System.out.print("1=>Tek Yön , 2=>Gidiş-Dönüş: ");
        choice=input.nextInt();

        System.out.print("Yasinizi Giriniz: ");
        age=input.nextInt();

        totalPrice=km*perKmPrice;

        if(km>0 && age>0) {
            if (choice == 1 || choice == 2) {
                if (age < 12) {
                    totalPrice = totalPrice / 2;
                    if (choice == 2) {
                        totalPrice -= (totalPrice*0.2);
                        totalPrice *= 2;
                    }
                } else if (age <= 24) {
                    totalPrice -= (totalPrice*0.1);
                    if(choice==2) {
                        totalPrice -= (totalPrice *0.2);
                        totalPrice *= 2;
                    }
                    System.out.println(totalPrice);
                } else if (age > 65) {
                    totalPrice -= (totalPrice*0.3);
                    if(choice==2){
                        totalPrice-=(totalPrice*0.2);
                        totalPrice*=2;
                    }
                    System.out.println(totalPrice);
                }else {
                    System.out.println(totalPrice);
                }

            } else {
                System.out.println("Hatalı veri girdiniz");
            }
        }else {
            System.out.println("Yaş ve km 0 dan küçük olamaz");

        }
    }
}
