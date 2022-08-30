package ATMProjesi;
import java.util.Scanner;


public class Odev {
    public static void main(String[] args) {

        String userName, passWord;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int deposit,withdraw;

        do {
            System.out.print("Enter Username: ");
            userName = input.nextLine();
            System.out.print("Enter Password: ");
            passWord = input.nextLine();
            if (userName.equals("Mehmet") && passWord.equals("123")) {
                System.out.println("You have entered succesfully !");


                do {
                    System.out.println("\n 1-Deposit \n 2-Withdraw Money\n 3-Account Balance \n 4-Log out ");
                    System.out.print("\nChoose the action you want to make : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("The Amount of money you want to Deposit: ");
                             deposit = input.nextInt();
                            balance += deposit;
                            System.out.print("\nYour current balance :" + balance);
                            break;
                        case 2:
                            System.out.print("The Amount of Withdraw: ");
                             withdraw = input.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= withdraw;
                                System.out.println("Your Amount :" + balance);

                            }
                            break;
                        case 3:
                            System.out.println("Your current balance :" + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("See you soon.");
                break;


            } else {
                right--;
                System.out.println("You entered an incorrect user or password, try again");
                System.out.println("Your remaining right: " + right);
                if (right == 0) {
                    System.out.println("Your account has been blocked. Contact XQ Bank or Call the Customer Service");
                }
            }
        } while (right > 0);

    }
}


