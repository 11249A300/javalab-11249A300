import java.util.Scanner;

public class railway{
    public static void main (String[] args ){
        String[ ] trainCodes = { " EXP101","SF102","PASS303","RAJ404"};

        Scanner s = new Scanner(System.in);

        System.out.println("Enter train index: ");
        int index = s.nextInt();

        try {
            System.out.println("Train Code: "+trainCodes[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid train index!");
        }
        s.close();
    }
}
