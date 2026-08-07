import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basicSalary;

    Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Name          : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
    }
}

class PermanentEmployee extends Employee {
    double hra;
    double da;
    double grossSalary;

    PermanentEmployee(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
        grossSalary = basicSalary + hra + da;
    }

    void displayPermanentDetails() {
        super.displayEmployeeDetails();
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Gross Salary  : " + grossSalary);
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = s.nextInt();
        s.nextLine();

        System.out.print("Enter Name: ");
        String name = s.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = s.nextDouble();

        PermanentEmployee pe = new PermanentEmployee(id, name, basic);

        System.out.println("\nEmployee Details:");
        pe.displayPermanentDetails();

        s.close();
    }
}