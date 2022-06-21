package IfVeElseBloklari;

public class IcIceVersion {
    public static void main(String[] args) {
        int a =10 , b=20 , c=12;

        if (a < b){
            if(a < c ){
                if (a ==10){
                    System.out.println("A sayisi  10'dur");
                }
                System.out.println("a en kucuktur");
            }else {
                System.out.println("a sayisi c'den buyuktur! ");
            }
        }

    }
}
