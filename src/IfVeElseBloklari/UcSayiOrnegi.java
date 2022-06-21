package IfVeElseBloklari;

public class UcSayiOrnegi {
    public static void main(String[] args) {
        int a=10 ,b=20 , c=1;

        if( (a<b) && (a<c)  ){
             System.out.println("A en kucuk sayidir!");

        } else if ((b < a) && (b < c) ) {

            System.out.println("B en kucuk sayidir!");
        }else {
            System.out.println("C en kucuk sayidir!");
        }
        /*else if ((c < a) && (c < b)) {

            System.out.println("C en kucuk sayidir!");
        }
        */
    }
}
