import java.util.Scanner;

public class Withdrawl 
{
    public static void main(String[] args) {
        int accountBalance = 10000; // Initial account balance
        int withdrawalAmount = 2000; // Withdrawal amount

        Scanner sc = new Scanner(System.in);

        System.out.println("Initial Account Balance: " + accountBalance);

    
        while (accountBalance >= withdrawalAmount) {
            System.out.println("Withdrawing 2000 rupees");
            accountBalance -= withdrawalAmount; // Deduct withdrawal amount
            System.out.println("Remaining Account Balance: " + accountBalance);
        }

        System.out.println("Insufficient funds. Cannot withdraw " + withdrawalAmount + " rupees.");

    
    }
}
