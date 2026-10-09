
import java.io.*;

public class TextEditor {
    public static void main(String[] args) {
        try {
            // Write content to file
            FileWriter fw = new FileWriter("text.txt");

            fw.write("Welcome to Java Programming.\n");
            fw.write("File handling is easy.");

            fw.close();

            System.out.println("Content written successfully.");

            // Read content from file
            FileReader fr = new FileReader("text.txt");

            int ch;
            System.out.println("\nFile Content:");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
