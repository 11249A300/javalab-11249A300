import java.util.Scanner;

interface Payment {
    void pay();
}

class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Payment made using UPI.");
    }
}

class CardPayment implements Payment {
    public void pay() {
        System.out.println("Payment made using Card.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== PAYMENT SYSTEM =====");
        System.out.println("1. UPI Payment");
        System.out.println("2. Card Payment");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Payment payment;

        if (choice == 1) {
            payment = new UPIPayment();
            payment.pay();
        }
        else if (choice == 2) {
            payment = new CardPayment();
            payment.pay();
        }
        else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
