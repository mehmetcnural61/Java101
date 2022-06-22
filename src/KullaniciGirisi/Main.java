package KullaniciGirisi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName,password,passRenew,newPassword;

        Scanner inp=new Scanner(System.in);

        System.out.print("Kullanici Adini Giriniz: ");
        userName = inp.nextLine();
        System.out.print("Sifrenizi Giriniz: ");
        password = inp.nextLine();

        //stringler için equals'la tanımlıyoruz


/*
        if(userName.equals("patika") && password.equals("java123")) {
            System.out.println("\nBasari ile Giris Yapildi :)");
        } else if (userName.equals("patika")) {
            System.out.println("Username Dogru fakat sifre yanlis");
        } else if (password.equals("java123")) {
            System.out.println("Password Dogru fakat username yanlis");
        } else {
            System.out.println("\nUsername ve Sifreniz Yanlis !");
        }
*/
        if(userName.equals("patika") && password.equals("java123")) {
            System.out.println("\nBasari ile Giris Yapildi :)");
        } else {
            System.out.print("Username veya password yanlis,yeni sifre belirlemek istiyorsaniz \\\"yes\\\"  istemiyorsaniz \\\" no\\\"  secimi yapin: ");
            passRenew=inp.nextLine();

             if (passRenew.equals("no")){
                 System.out.println("Giris Sonlandirildi");

             } else if (passRenew.equals("yes")) {
                 System.out.print("Yeni Sifrenizi Yaziniz: ");
                 newPassword=inp.nextLine();

                 if(!(newPassword.equals("java123") || newPassword.equals(password))){

                     System.out.println("sifre basariyla yenilendi");

                 }else {
                     System.out.print("Bir onceki sifreden farkli bir sifre giriniz: ");
                     newPassword=inp.nextLine();
                     System.out.print("Yeni Sifreniz Budur:"+newPassword+"Basariyla girildi!");

                 }

             }else {
                 System.out.println("Hatali Giris ");
             }
        }

    }
}
