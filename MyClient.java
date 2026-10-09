
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000);

            BufferedReader in = new BufferedReader(
                new InputStreamReader(s.getInputStream()));

            PrintWriter out = new PrintWriter(
                s.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);

            System.out.println("Connected to server.");
            System.out.println("Type 'exit' to disconnect.");

            while (true) {
                System.out.print("Enter message: ");
                String message = sc.nextLine();

                out.println(message);

                String reply = in.readLine();
                System.out.println(reply);

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            s.close();
            sc.close();

        } catch (IOException e) {
            System.out.println("Client stopped: " + e.getMessage());
        }
    }
}
