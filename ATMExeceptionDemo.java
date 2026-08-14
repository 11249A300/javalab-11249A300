import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message){
        super(message);
    }
}
class ATM {
    double balance;

    ATM(double balance){
        this.balance = balance;
    }
    void withdraw(double amount) throws InsufficientBalanceException{
        if (amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance! Available balance: "+balance);
        }
        balance = balance - amount;
        System.out.println("WIthdrawal Successfull!");
        System.out.println("Withdrawal Amount: "+amount);
        System.out.println("Remaining Balance: "+balance);
    }
}
public class ATMExeceptionDemo{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        ATM atm = new ATM(5000);
        System.out.println("Available Balance: "+atm.balance);

        System.out.println("Enter amount to withdraw: ");
        double amount = s.nextDouble();
        try {
            atm.withdraw(amount);
        }
        catch (InsufficientBalanceException e){
            System.out.println("Exeception: "+e.getMessage());
        }
        s.close();
    }
}
