import java.util.Scanner;

public class age{
    public static void main (String[] args){
        Scanner c = new Scanner(System.in);

        try {
            System.out.println("Enter your age: ");
            String input = c.nextLine();

            int age = Integer.parseInt(input);

            int result = 100 / age;

            System.out.println("Age: "+age);
            System.out.println("100 / Age = "+result);
        }catch (NumberFormatException e){
            System.out.println("Error: Please enter a valid numeric age. ");
        } catch (ArithmeticException e){
            System.out.println("Error : Age cannot be Zero.");
        } finally {
            c.close();
            System.out.println("Program ended");
        }
    }
}
