package SinifiGecmeDurumu;
import java.util.Scanner;

public class Version2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int mat,fzk,kim,tr,mzk;
        double avg=0.0;


        System.out.print("Mat notu giriniz : ");
        mat=scanner.nextInt();
        if(mat<0 || mat>100){
            System.out.print("Yanlış not aralığı girdiniz");
            mat=scanner.nextInt();
        }else{
            avg+=mat;
        }

        System.out.print("Fizik notu giriniz : ");
        fzk=scanner.nextInt();
        if(fzk<0 || fzk>100){
            System.out.print("Yanlış not aralığı girdiniz");
            fzk=scanner.nextInt();
        }else{
            avg+=fzk;
        }

        System.out.print("Kimya notu giriniz : ");
        kim=scanner.nextInt();
        if(kim<0 || kim>100){
            System.out.print("Yanlış not aralığı girdiniz");
            kim=scanner.nextInt();
        }else{
            avg+=kim;
        }

        System.out.print("TR notu giriniz : ");
        tr=scanner.nextInt();
        if(tr<0 || tr>100){
            System.out.print("Yanlış not aralığı girdiniz");
            tr=scanner.nextInt();
        }else{
            avg+=tr;
        }

        System.out.print("Müzik notu giriniz : ");
        mzk=scanner.nextInt();
        if(mzk<0 ||  mzk>100){
            System.out.print("Yanlış not aralığı girdiniz");
            mzk=scanner.nextInt();
        }else{
            avg+=mzk;
        }

        avg/=5;

        if(!(avg<0 || avg>100)){
            if(avg>=55){
                System.out.println("Geçtiniz ortalamanız : "+avg);
            }else{
                System.out.println("kaldınız ortalamanız : "+avg);
            }
        }else{
            System.out.print("Geçersiz ortalama : "+avg);
        }


    }
}
