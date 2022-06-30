package DoWhileDongusu;
import java.util.Scanner;

public class PswGiris {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int pass;
        boolean askPswrd=true;

        do {
            System.out.print("Enter Password: ");
            pass=input.nextInt();
            if (pass == 123){
                System.out.println("Correct -.-)/' ");
                askPswrd=false;
            }else {
                System.out.println("Error !! : ( Probably False");
            }
        }while (askPswrd);


    }
}
