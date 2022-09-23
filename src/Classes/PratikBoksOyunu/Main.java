package Classes.PratikBoksOyunu;

public class Main {
    public static void main(String[] args) {

        Fighter f1=new Fighter("Mike",10,120,100,80);
        Fighter f2=new Fighter("Brian",10,85,90,80);

        Match match=new Match(f1,f2,70,100);
        match.run();
    }

}
