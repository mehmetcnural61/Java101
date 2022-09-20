package Classes.NesneOlusturmaVeSinifMetotlari;


public class Main {

    public static void main(String[] args) {


        Car audi = new Car("Audi", 20, "Grey");

        audi.increaseSpeed(20);
        audi.decreaseSpeed(10);
        audi.printInfo();
        //  System.out.println(audi.model+" Hızı: "+audi.speed);


        System.out.println("===");

        Car bmw = new Car("BMW 3.20d", 28, "Blue");

        bmw.increaseSpeed(26);
        bmw.increaseSpeed(60);
        bmw.printInfo();
        //   System.out.println(bmw.model+" Hizi: "+bmw.speed);
        System.out.println("===");
        Car mercedes = new Car("Mercedes SLS AMG ", 30, "Red");

        mercedes.printInfo();
        //   System.out.println(mercedes.model+" Hizi: "+mercedes.speed);

        System.out.println("===");

        Car rover = new Car();
        rover.model = "Rover";
        rover.speed = 35;
        System.out.println(rover.model + " Hizi: " + rover.speed);


    }
}
