import java.util.Scanner;

class Student {
    int rollNo;
    String name;

    void inputStudent(Scanner sc) {
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name   : " + name);
    }
}

class Marks extends Student {
    int m1, m2, m3, m4, m5;

    void inputMarks(Scanner sc) {
        System.out.print("Enter marks in 5 subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();
    }

    void displayMarks() {
        System.out.println("Marks  : " + m1 + ", " + m2 + ", " + m3 + ", " + m4 + ", " + m5);
    }
}

class Result extends Marks {
    int total;
    double average;
    String grade;

    void calculateResult() {
        total = m1 + m2 + m3 + m4 + m5;
        average = total / 5.0;

        if (average >= 90)
            grade = "A+";
        else if (average >= 80)
            grade = "A";
        else if (average >= 70)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";
    }

    void displayResult() {
        displayStudent();
        displayMarks();
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + grade);
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result r = new Result();
        r.inputStudent(sc);
        r.inputMarks(sc);
        r.calculateResult();

        System.out.println("\nStudent Result:");
        r.displayResult();

        sc.close();
    }
}