import java.io.*;
public class FitnessApp {
    public static void main(String[] args){
        try{
            FileOutputStream fout = new FileOutputStream("Profile.txt");

        String data = "Name: Ravi\n Age: 20\nFitness Goal: Weight Loss";
        fout.write(data.getBytes());
        fout.close();

        System.out.println("Profile Written Successfully.");

        FileInputStream fin = new FileInputStream("profile.txt");

        int ch;
        System.out.println("\nUser Profile: ");

        while((ch = fin.read()) !=-1 ) {
            System.out.print((char) ch);
        }
        fin.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
