
import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server started...");
            System.out.println("Waiting for client...");

            while (true) {
                Socket s = ss.accept();
                System.out.println("Client connected.");

                BufferedReader in = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));

                PrintWriter out = new PrintWriter(
                    s.getOutputStream(), true);

                String message;

                while ((message = in.readLine()) != null) {
                    if (message.equalsIgnoreCase("exit")) {
                        out.println("Connection closed.");
                        break;
                    }

                    System.out.println("Client: " + message);
                    out.println("Server received: " + message);
                }

                s.close();
                System.out.println("Client disconnected.");
                System.out.println("Waiting for client...");
            }
        } catch (IOException e) {
            System.out.println("Server stopped: " + e.getMessage());
        }
    }
}
