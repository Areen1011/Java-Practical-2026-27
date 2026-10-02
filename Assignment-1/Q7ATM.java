import java.util.Scanner;

public class Q7ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.print("1. Balance\n2. Deposit Money\n3. Withdraw Money\n4. Exit\nEnter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Balance = " + balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                double deposit = sc.nextDouble();

                balance += deposit;

                System.out.println("Money deposited successfully.");
                System.out.println("Updated Balance = " + balance);
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                double withdraw = sc.nextDouble();

                if (withdraw <= balance) {
                    balance -= withdraw;

                    System.out.println("Please collect your money.");
                    System.out.println("Remaining Balance = " + balance);
                } else {
                    System.out.println("Insufficient Balance.");
                }
                break;

            case 4:
                System.out.println("Thank you for using ATM.");
                break;

            default:
                System.out.println("Invalid Choice.");
        }

        sc.close();
    }
}