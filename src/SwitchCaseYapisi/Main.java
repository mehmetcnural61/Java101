package SwitchCaseYapisi;

public class Main {
    public static void main(String[] args) {

        int day = 1;
/*
        if (day == 1) {
            System.out.println("Bugun Pazartesi");
        } else if (day ==2) {
            System.out.println("Bugun Salı");
        } else if (day ==3) {
            System.out.println("Bugun Carsamba");
        } else if (day==4) {
            System.out.println("Bugun Persembe");
        } else if (day==5) {
            System.out.println("Bugun Cuma");
        } else if (day==6) {
            System.out.println("Bugun Ctesi");
        } else if (day==7) {
            System.out.println("Bugun Pazar");
        }else {
            System.out.println("Hatali Giris Yaptiniz");
       }
*/
        switch (day){
            case 1:
                System.out.println("Bugun Pazartesi");
                System.out.println("Program Bitti");
                break;
            case 2:
                System.out.println("Bugun Sali");
                break;
            case 3:
                System.out.println("Bugun Carsamba");
                break;
            default:
                System.out.println("Hatali Giris Yapildi ! ");
        }


    }
}
