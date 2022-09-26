package Classes.PratikBoksOyunu;

import java.util.Scanner;

public class Main {
    public static final Scanner input=new Scanner(System.in);



    public static void main(String[] args) {

        String name=" ";
        int damage=0, health=0, weight=0, dodge=0;

        for (int i = 0; i < 1; i++) {
            System.out.println("Fighter 1 Bilgilerini Giriniz");
            System.out.print("Adı:");
            name=input.nextLine();
            System.out.print("Damage: ");
            damage=input.nextInt();
            System.out.print("Sağlık: ");
            health=input.nextInt();
            System.out.print("Ağırlık: ");
            weight=input.nextInt();
            System.out.print("Bloklama Oranı: ");
            dodge=input.nextInt();

        }
        Fighter f1 = new Fighter(name,damage,health,weight,dodge);
        System.out.println("===");
        for (int i = 0; i < 1; i++) {
            System.out.println("Fighter 2 Bilgilerini Giriniz:");
            System.out.print("Adı:");
            name=input.next();
            System.out.print("Damage: ");
            damage=input.nextInt();
            System.out.print("Sağlık: ");
            health=input.nextInt();
            System.out.print("Ağırlık: ");
            weight=input.nextInt();
            System.out.print("Bloklama Oranı: ");
            dodge=input.nextInt();

        }
        Fighter f2 = new Fighter(name,damage,health,weight,dodge);



       //  Fighter f1 = new Fighter(name,damage,health,weight,dodge);
       // Fighter f2 = new Fighter("Brian", 10, 85, 90, 80);


        Match match = new Match(f1, f2, 70, 100);
        match.run();
    }

}
