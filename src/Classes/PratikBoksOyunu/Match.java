package Classes.PratikBoksOyunu;

public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;

    }

    void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("===Yeni Round===");
                double random=Math.random()*100;
                if (random >=0 && random <=50){
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    f1.health=f2.hit(f1);
                }
                if (random>50 && random <=100){
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()){
                        break;
                    }
                    f2.health=f1.hit(f2);
                }

                System.out.println(this.f1.name+ " Sağlık :"+this.f1.health);
                System.out.println(this.f2.name+ " Sağlık :"+this.f2.health);
            }

        } else {
            System.out.println("Sporcuların sikletleri uymuyor ! ");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
                && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);


    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı !");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı !");
            return true;

        }
        return false;
    }
}

