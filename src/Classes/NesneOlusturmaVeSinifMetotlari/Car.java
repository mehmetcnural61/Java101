package Classes.NesneOlusturmaVeSinifMetotlari;

public class Car {
    // Nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    Car(String model, int speed, String color) {
        this.model = model;
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";
        this.speedLimit = 180;
    }

    Car(){
        System.out.println("Boş Constructor metodu oluştu");
    }

    //Davranış
    void increaseSpeed(int increment) {
        if ((speed + increment) < speedLimit) {
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed -= decrease;
        }
    }

    void printInfo() {
        System.out.println("Model:\t" + this.model);
        System.out.println("Color:\t" + this.color);
        System.out.println("Type:\t" + this.type);
        System.out.println("Speed:\t" + this.speed);
    }
}