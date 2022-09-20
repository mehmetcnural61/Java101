package Classes.NesneOlusturmaVeSinifMetotlari;


public class Main {

    public static void main(String[] args) {


        Car audi = new Car();
        audi.model= "Audi A8";
        audi.speed=25;
        audi.increaseSpeed(20);
        audi.decreaseSpeed(10);
        audi.printSpeed();
      //  System.out.println(audi.model+" Hızı: "+audi.speed);


        Car bmw = new Car();
        bmw.model="BMW 3.20d";
        bmw.speed=28;
        bmw.increaseSpeed(26);
        bmw.increaseSpeed(60);
        bmw.printSpeed();
     //   System.out.println(bmw.model+" Hizi: "+bmw.speed);

        Car mercedes = new Car();
        mercedes.model="Mercedes SLS AMG ";
        mercedes.speed=30;
        mercedes.printSpeed();
     //   System.out.println(mercedes.model+" Hizi: "+mercedes.speed);

    }
}
