import java.util.Scanner;

interface Printable {
    void printDetails();
}

interface Showable {
    void showGrade();
}

class StudentResult implements Printable, Showable {
    int rollNo;
    String name;
    int total;
    double average;

    StudentResult(int rollNo, String name, int total, double average) {
        this.rollNo = rollNo;
        this.name = name;
        this.total = total;
        this.average = average;
    }

    public void printDetails() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
    }

    public void showGrade() {
        if (average >= 90)
            System.out.println("Grade   : A+");
        else if (average >= 80)
            System.out.println("Grade   : A");
        else if (average >= 70)
            System.out.println("Grade   : B");
        else if (average >= 60)
            System.out.println("Grade   : C");
        else if (average >= 50)
            System.out.println("Grade   : D");
        else
            System.out.println("Grade   : F");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Total Marks: ");
        int total = sc.nextInt();

        System.out.print("Enter Average: ");
        double average = sc.nextDouble();

        StudentResult sr = new StudentResult(rollNo, name, total, average);

        System.out.println("\nStudent Details:");
        sr.printDetails();
        sr.showGrade();

        sc.close();
    }
}