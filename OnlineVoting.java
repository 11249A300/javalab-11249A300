import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message){
        super(message);
    }
}

public class OnlineVoting{
    public static void main(String[] args){
        Scanner h = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = h.nextInt();
        try {
            if (age < 18){
                throw new InvalidAgeException("Invalid Age! you must be 18 or above to vote.");
            }
            System.out.println("Your are Eligible to vote. ");
        }
        catch (InvalidAgeException e){
            System.out.println("Exception: "+e.getMessage());
        }
        h.close();
    }

}
