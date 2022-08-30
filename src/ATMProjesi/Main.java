package ATMProjesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int girisHakki = 3;
        int balance=1500;
        int select;

        while (girisHakki > 0) {
            System.out.print("Kullanici Adiniz: ");
            userName = input.nextLine();
            System.out.print("Parolaniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, X Bankasına Hoşgeldiniz! ");
               do {

                   System.out.println(
                           "1-Para Yatırma\n"+
                                   "2-Para Çekme\n" +
                                   "3-Bakiye Sorgula\n" +
                                   "4-Çıkış Yap");
                   System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                   select=input.nextInt();

                   if (select==1){
                       System.out.print("Para Miktari: ");
                       int price=input.nextInt();
                       balance+=price;
                   } else if (select==2) {
                       System.out.print("Para Miktari: ");
                       int price=input.nextInt();
                       if (price>balance){
                           System.out.println("Çekmek istenilen Bakiye Yetersiz");
                       }else {
                           balance-=price;
                       }
                   } else if (select==3) {
                       System.out.println("Bakiyeniz: "+balance);
                   }

               }while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere ");
                break;
            } else {
                girisHakki--;
                System.out.println("Hatali kullanici adi veya sifre.Tekrar Deneyiniz! ");
                if (girisHakki == 0) {
                    System.out.println("Hesap Bloke Olmuştur Lütfen Banka ile İletişime Geçiniz");
                } else {
                    System.out.println("Kalan  Hakkiniz: " + girisHakki);

                }
            }


        }
    }
}
